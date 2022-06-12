/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables.records;


import jooq.steve.db.tables.Settings;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SettingsRecord extends UpdatableRecordImpl<SettingsRecord> implements Record12<String, Integer, Integer, Boolean, String, String, String, String, String, Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>stevedb.settings.app_id</code>.
     */
    public SettingsRecord setAppId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.app_id</code>.
     */
    public String getAppId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>stevedb.settings.heartbeat_interval_in_seconds</code>.
     */
    public SettingsRecord setHeartbeatIntervalInSeconds(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.heartbeat_interval_in_seconds</code>.
     */
    public Integer getHeartbeatIntervalInSeconds() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>stevedb.settings.hours_to_expire</code>.
     */
    public SettingsRecord setHoursToExpire(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.hours_to_expire</code>.
     */
    public Integer getHoursToExpire() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>stevedb.settings.mail_enabled</code>.
     */
    public SettingsRecord setMailEnabled(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.mail_enabled</code>.
     */
    public Boolean getMailEnabled() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>stevedb.settings.mail_host</code>.
     */
    public SettingsRecord setMailHost(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.mail_host</code>.
     */
    public String getMailHost() {
        return (String) get(4);
    }

    /**
     * Setter for <code>stevedb.settings.mail_username</code>.
     */
    public SettingsRecord setMailUsername(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.mail_username</code>.
     */
    public String getMailUsername() {
        return (String) get(5);
    }

    /**
     * Setter for <code>stevedb.settings.mail_password</code>.
     */
    public SettingsRecord setMailPassword(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.mail_password</code>.
     */
    public String getMailPassword() {
        return (String) get(6);
    }

    /**
     * Setter for <code>stevedb.settings.mail_from</code>.
     */
    public SettingsRecord setMailFrom(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.mail_from</code>.
     */
    public String getMailFrom() {
        return (String) get(7);
    }

    /**
     * Setter for <code>stevedb.settings.mail_protocol</code>.
     */
    public SettingsRecord setMailProtocol(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.mail_protocol</code>.
     */
    public String getMailProtocol() {
        return (String) get(8);
    }

    /**
     * Setter for <code>stevedb.settings.mail_port</code>.
     */
    public SettingsRecord setMailPort(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.mail_port</code>.
     */
    public Integer getMailPort() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>stevedb.settings.mail_recipients</code>. comma separated
     * list of email addresses
     */
    public SettingsRecord setMailRecipients(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.mail_recipients</code>. comma separated
     * list of email addresses
     */
    public String getMailRecipients() {
        return (String) get(10);
    }

    /**
     * Setter for <code>stevedb.settings.notification_features</code>. comma
     * separated list
     */
    public SettingsRecord setNotificationFeatures(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.settings.notification_features</code>. comma
     * separated list
     */
    public String getNotificationFeatures() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, Integer, Integer, Boolean, String, String, String, String, String, Integer, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, Integer, Integer, Boolean, String, String, String, String, String, Integer, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Settings.SETTINGS.APP_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Settings.SETTINGS.HEARTBEAT_INTERVAL_IN_SECONDS;
    }

    @Override
    public Field<Integer> field3() {
        return Settings.SETTINGS.HOURS_TO_EXPIRE;
    }

    @Override
    public Field<Boolean> field4() {
        return Settings.SETTINGS.MAIL_ENABLED;
    }

    @Override
    public Field<String> field5() {
        return Settings.SETTINGS.MAIL_HOST;
    }

    @Override
    public Field<String> field6() {
        return Settings.SETTINGS.MAIL_USERNAME;
    }

    @Override
    public Field<String> field7() {
        return Settings.SETTINGS.MAIL_PASSWORD;
    }

    @Override
    public Field<String> field8() {
        return Settings.SETTINGS.MAIL_FROM;
    }

    @Override
    public Field<String> field9() {
        return Settings.SETTINGS.MAIL_PROTOCOL;
    }

    @Override
    public Field<Integer> field10() {
        return Settings.SETTINGS.MAIL_PORT;
    }

    @Override
    public Field<String> field11() {
        return Settings.SETTINGS.MAIL_RECIPIENTS;
    }

    @Override
    public Field<String> field12() {
        return Settings.SETTINGS.NOTIFICATION_FEATURES;
    }

    @Override
    public String component1() {
        return getAppId();
    }

    @Override
    public Integer component2() {
        return getHeartbeatIntervalInSeconds();
    }

    @Override
    public Integer component3() {
        return getHoursToExpire();
    }

    @Override
    public Boolean component4() {
        return getMailEnabled();
    }

    @Override
    public String component5() {
        return getMailHost();
    }

    @Override
    public String component6() {
        return getMailUsername();
    }

    @Override
    public String component7() {
        return getMailPassword();
    }

    @Override
    public String component8() {
        return getMailFrom();
    }

    @Override
    public String component9() {
        return getMailProtocol();
    }

    @Override
    public Integer component10() {
        return getMailPort();
    }

    @Override
    public String component11() {
        return getMailRecipients();
    }

    @Override
    public String component12() {
        return getNotificationFeatures();
    }

    @Override
    public String value1() {
        return getAppId();
    }

    @Override
    public Integer value2() {
        return getHeartbeatIntervalInSeconds();
    }

    @Override
    public Integer value3() {
        return getHoursToExpire();
    }

    @Override
    public Boolean value4() {
        return getMailEnabled();
    }

    @Override
    public String value5() {
        return getMailHost();
    }

    @Override
    public String value6() {
        return getMailUsername();
    }

    @Override
    public String value7() {
        return getMailPassword();
    }

    @Override
    public String value8() {
        return getMailFrom();
    }

    @Override
    public String value9() {
        return getMailProtocol();
    }

    @Override
    public Integer value10() {
        return getMailPort();
    }

    @Override
    public String value11() {
        return getMailRecipients();
    }

    @Override
    public String value12() {
        return getNotificationFeatures();
    }

    @Override
    public SettingsRecord value1(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public SettingsRecord value2(Integer value) {
        setHeartbeatIntervalInSeconds(value);
        return this;
    }

    @Override
    public SettingsRecord value3(Integer value) {
        setHoursToExpire(value);
        return this;
    }

    @Override
    public SettingsRecord value4(Boolean value) {
        setMailEnabled(value);
        return this;
    }

    @Override
    public SettingsRecord value5(String value) {
        setMailHost(value);
        return this;
    }

    @Override
    public SettingsRecord value6(String value) {
        setMailUsername(value);
        return this;
    }

    @Override
    public SettingsRecord value7(String value) {
        setMailPassword(value);
        return this;
    }

    @Override
    public SettingsRecord value8(String value) {
        setMailFrom(value);
        return this;
    }

    @Override
    public SettingsRecord value9(String value) {
        setMailProtocol(value);
        return this;
    }

    @Override
    public SettingsRecord value10(Integer value) {
        setMailPort(value);
        return this;
    }

    @Override
    public SettingsRecord value11(String value) {
        setMailRecipients(value);
        return this;
    }

    @Override
    public SettingsRecord value12(String value) {
        setNotificationFeatures(value);
        return this;
    }

    @Override
    public SettingsRecord values(String value1, Integer value2, Integer value3, Boolean value4, String value5, String value6, String value7, String value8, String value9, Integer value10, String value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SettingsRecord
     */
    public SettingsRecord() {
        super(Settings.SETTINGS);
    }

    /**
     * Create a detached, initialised SettingsRecord
     */
    public SettingsRecord(String appId, Integer heartbeatIntervalInSeconds, Integer hoursToExpire, Boolean mailEnabled, String mailHost, String mailUsername, String mailPassword, String mailFrom, String mailProtocol, Integer mailPort, String mailRecipients, String notificationFeatures) {
        super(Settings.SETTINGS);

        setAppId(appId);
        setHeartbeatIntervalInSeconds(heartbeatIntervalInSeconds);
        setHoursToExpire(hoursToExpire);
        setMailEnabled(mailEnabled);
        setMailHost(mailHost);
        setMailUsername(mailUsername);
        setMailPassword(mailPassword);
        setMailFrom(mailFrom);
        setMailProtocol(mailProtocol);
        setMailPort(mailPort);
        setMailRecipients(mailRecipients);
        setNotificationFeatures(notificationFeatures);
    }
}
