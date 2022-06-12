/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables.records;


import jooq.steve.db.tables.ConnectorStatus;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConnectorStatusRecord extends TableRecordImpl<ConnectorStatusRecord> implements Record7<Integer, DateTime, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>stevedb.connector_status.connector_pk</code>.
     */
    public ConnectorStatusRecord setConnectorPk(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.connector_status.connector_pk</code>.
     */
    public Integer getConnectorPk() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>stevedb.connector_status.status_timestamp</code>.
     */
    public ConnectorStatusRecord setStatusTimestamp(DateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.connector_status.status_timestamp</code>.
     */
    public DateTime getStatusTimestamp() {
        return (DateTime) get(1);
    }

    /**
     * Setter for <code>stevedb.connector_status.status</code>.
     */
    public ConnectorStatusRecord setStatus(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.connector_status.status</code>.
     */
    public String getStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>stevedb.connector_status.error_code</code>.
     */
    public ConnectorStatusRecord setErrorCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.connector_status.error_code</code>.
     */
    public String getErrorCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>stevedb.connector_status.error_info</code>.
     */
    public ConnectorStatusRecord setErrorInfo(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.connector_status.error_info</code>.
     */
    public String getErrorInfo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>stevedb.connector_status.vendor_id</code>.
     */
    public ConnectorStatusRecord setVendorId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.connector_status.vendor_id</code>.
     */
    public String getVendorId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>stevedb.connector_status.vendor_error_code</code>.
     */
    public ConnectorStatusRecord setVendorErrorCode(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.connector_status.vendor_error_code</code>.
     */
    public String getVendorErrorCode() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, DateTime, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, DateTime, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ConnectorStatus.CONNECTOR_STATUS.CONNECTOR_PK;
    }

    @Override
    public Field<DateTime> field2() {
        return ConnectorStatus.CONNECTOR_STATUS.STATUS_TIMESTAMP;
    }

    @Override
    public Field<String> field3() {
        return ConnectorStatus.CONNECTOR_STATUS.STATUS;
    }

    @Override
    public Field<String> field4() {
        return ConnectorStatus.CONNECTOR_STATUS.ERROR_CODE;
    }

    @Override
    public Field<String> field5() {
        return ConnectorStatus.CONNECTOR_STATUS.ERROR_INFO;
    }

    @Override
    public Field<String> field6() {
        return ConnectorStatus.CONNECTOR_STATUS.VENDOR_ID;
    }

    @Override
    public Field<String> field7() {
        return ConnectorStatus.CONNECTOR_STATUS.VENDOR_ERROR_CODE;
    }

    @Override
    public Integer component1() {
        return getConnectorPk();
    }

    @Override
    public DateTime component2() {
        return getStatusTimestamp();
    }

    @Override
    public String component3() {
        return getStatus();
    }

    @Override
    public String component4() {
        return getErrorCode();
    }

    @Override
    public String component5() {
        return getErrorInfo();
    }

    @Override
    public String component6() {
        return getVendorId();
    }

    @Override
    public String component7() {
        return getVendorErrorCode();
    }

    @Override
    public Integer value1() {
        return getConnectorPk();
    }

    @Override
    public DateTime value2() {
        return getStatusTimestamp();
    }

    @Override
    public String value3() {
        return getStatus();
    }

    @Override
    public String value4() {
        return getErrorCode();
    }

    @Override
    public String value5() {
        return getErrorInfo();
    }

    @Override
    public String value6() {
        return getVendorId();
    }

    @Override
    public String value7() {
        return getVendorErrorCode();
    }

    @Override
    public ConnectorStatusRecord value1(Integer value) {
        setConnectorPk(value);
        return this;
    }

    @Override
    public ConnectorStatusRecord value2(DateTime value) {
        setStatusTimestamp(value);
        return this;
    }

    @Override
    public ConnectorStatusRecord value3(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public ConnectorStatusRecord value4(String value) {
        setErrorCode(value);
        return this;
    }

    @Override
    public ConnectorStatusRecord value5(String value) {
        setErrorInfo(value);
        return this;
    }

    @Override
    public ConnectorStatusRecord value6(String value) {
        setVendorId(value);
        return this;
    }

    @Override
    public ConnectorStatusRecord value7(String value) {
        setVendorErrorCode(value);
        return this;
    }

    @Override
    public ConnectorStatusRecord values(Integer value1, DateTime value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConnectorStatusRecord
     */
    public ConnectorStatusRecord() {
        super(ConnectorStatus.CONNECTOR_STATUS);
    }

    /**
     * Create a detached, initialised ConnectorStatusRecord
     */
    public ConnectorStatusRecord(Integer connectorPk, DateTime statusTimestamp, String status, String errorCode, String errorInfo, String vendorId, String vendorErrorCode) {
        super(ConnectorStatus.CONNECTOR_STATUS);

        setConnectorPk(connectorPk);
        setStatusTimestamp(statusTimestamp);
        setStatus(status);
        setErrorCode(errorCode);
        setErrorInfo(errorInfo);
        setVendorId(vendorId);
        setVendorErrorCode(vendorErrorCode);
    }
}
