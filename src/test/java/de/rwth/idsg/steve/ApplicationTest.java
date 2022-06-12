/*
 * SteVe - SteckdosenVerwaltung - https://github.com/RWTH-i5-IDSG/steve
 * Copyright (C) 2013-2021 RWTH Aachen University - Information Systems - Intelligent Distributed Systems Group (IDSG).
 * All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package de.rwth.idsg.steve;

import de.rwth.idsg.steve.utils.__DatabasePreparer__;
import lombok.extern.slf4j.Slf4j;
import ocpp.cs._2010._08.AuthorizationStatus;
import ocpp.cs._2010._08.AuthorizeRequest;
import ocpp.cs._2010._08.AuthorizeResponse;
import ocpp.cs._2010._08.BootNotificationRequest;
import ocpp.cs._2010._08.BootNotificationResponse;
import ocpp.cs._2010._08.RegistrationStatus;
import ocpp.cs._2012._06.CentralSystemService;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.xml.ws.WebServiceException;

import static de.rwth.idsg.steve.utils.Helpers.getForOcpp12;
import static de.rwth.idsg.steve.utils.Helpers.getForOcpp15;
import static de.rwth.idsg.steve.utils.Helpers.getForOcpp16;
import static de.rwth.idsg.steve.utils.Helpers.getPath;
import static de.rwth.idsg.steve.utils.Helpers.getRandomString;

/**
 * @author Sevket Goekay <goekay@dbis.rwth-aachen.de>
 * @since 10.03.2018
 */
@Slf4j
public class ApplicationTest {

    private static final String REGISTERED_CHARGE_BOX_ID = __DatabasePreparer__.getRegisteredChargeBoxId();
    private static final String REGISTERED_OCPP_TAG =  __DatabasePreparer__.getRegisteredOcppTag();
    private static final String path = getPath();

    private static Application app;

    @BeforeClass
    public static void init() throws Exception {
        Assert.assertEquals(ApplicationProfile.TEST, SteveConfiguration.CONFIG.getProfile());
        __DatabasePreparer__.prepare();

        app = new Application();
        app.start();
    }

    @AfterClass
    public static void destroy() throws Exception {
        if (app != null) {
            app.stop();
        }
        __DatabasePreparer__.cleanUp();
    }

    @Test
    public void testOcpp12() {
        ocpp.cs._2010._08.CentralSystemService client = getForOcpp12(path);

        BootNotificationResponse boot = client.bootNotification(
                new BootNotificationRequest()
                        .withChargePointVendor(getRandomString())
                        .withChargePointModel(getRandomString()),
                REGISTERED_CHARGE_BOX_ID);
        Assert.assertNotNull(boot);
        Assert.assertEquals(RegistrationStatus.ACCEPTED, boot.getStatus());

        AuthorizeResponse auth = client.authorize(
                new AuthorizeRequest()
                        .withIdTag(REGISTERED_OCPP_TAG),
                REGISTERED_CHARGE_BOX_ID);
        Assert.assertNotNull(auth);
        Assert.assertEquals(AuthorizationStatus.ACCEPTED, auth.getIdTagInfo().getStatus());
    }

    @Test
    public void testOcpp15() {
        CentralSystemService client = getForOcpp15(path);

        ocpp.cs._2012._06.BootNotificationResponse boot = client.bootNotification(
                new ocpp.cs._2012._06.BootNotificationRequest()
                        .withChargePointVendor(getRandomString())
                        .withChargePointModel(getRandomString()),
                REGISTERED_CHARGE_BOX_ID);
        Assert.assertNotNull(boot);
        Assert.assertEquals(ocpp.cs._2012._06.RegistrationStatus.ACCEPTED, boot.getStatus());

        ocpp.cs._2012._06.AuthorizeResponse auth = client.authorize(
                new ocpp.cs._2012._06.AuthorizeRequest()
                        .withIdTag(REGISTERED_OCPP_TAG),
                REGISTERED_CHARGE_BOX_ID);
        Assert.assertNotNull(auth);
        Assert.assertEquals(ocpp.cs._2012._06.AuthorizationStatus.ACCEPTED, auth.getIdTagInfo().getStatus());
    }

    /**
     * WebServiceException because we are sending an AuthorizeRequest from a random/unknown station.
     */
    @Test(expected = WebServiceException.class)
    public void testOcpp16() {
        ocpp.cs._2015._10.CentralSystemService client = getForOcpp16(path);

        ocpp.cs._2015._10.BootNotificationResponse boot = client.bootNotification(
                new ocpp.cs._2015._10.BootNotificationRequest()
                        .withChargePointVendor(getRandomString())
                        .withChargePointModel(getRandomString()),
                getRandomString());
        Assert.assertNotNull(boot);
        Assert.assertEquals(ocpp.cs._2015._10.RegistrationStatus.REJECTED, boot.getStatus());

        ocpp.cs._2015._10.AuthorizeResponse auth = client.authorize(
                new ocpp.cs._2015._10.AuthorizeRequest()
                        .withIdTag(getRandomString()),
                getRandomString());
        Assert.assertNotNull(auth);
        Assert.assertEquals(ocpp.cs._2015._10.AuthorizationStatus.INVALID, auth.getIdTagInfo().getStatus());
    }

}
