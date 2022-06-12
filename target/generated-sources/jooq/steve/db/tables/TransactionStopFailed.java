/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables;


import de.rwth.idsg.steve.utils.DateTimeConverter;

import jooq.steve.db.Stevedb;
import jooq.steve.db.enums.TransactionStopFailedEventActor;
import jooq.steve.db.tables.records.TransactionStopFailedRecord;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransactionStopFailed extends TableImpl<TransactionStopFailedRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>stevedb.transaction_stop_failed</code>
     */
    public static final TransactionStopFailed TRANSACTION_STOP_FAILED = new TransactionStopFailed();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TransactionStopFailedRecord> getRecordType() {
        return TransactionStopFailedRecord.class;
    }

    /**
     * The column <code>stevedb.transaction_stop_failed.transaction_pk</code>.
     */
    public final TableField<TransactionStopFailedRecord, Integer> TRANSACTION_PK = createField(DSL.name("transaction_pk"), SQLDataType.INTEGER.defaultValue(DSL.inline("NULL", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>stevedb.transaction_stop_failed.event_timestamp</code>.
     */
    public final TableField<TransactionStopFailedRecord, DateTime> EVENT_TIMESTAMP = createField(DSL.name("event_timestamp"), SQLDataType.TIMESTAMP(6).nullable(false).defaultValue(DSL.field("current_timestamp(6)", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.transaction_stop_failed.event_actor</code>.
     */
    public final TableField<TransactionStopFailedRecord, TransactionStopFailedEventActor> EVENT_ACTOR = createField(DSL.name("event_actor"), SQLDataType.VARCHAR(7).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)).asEnumDataType(jooq.steve.db.enums.TransactionStopFailedEventActor.class), this, "");

    /**
     * The column <code>stevedb.transaction_stop_failed.stop_timestamp</code>.
     */
    public final TableField<TransactionStopFailedRecord, DateTime> STOP_TIMESTAMP = createField(DSL.name("stop_timestamp"), SQLDataType.TIMESTAMP(6).nullable(false).defaultValue(DSL.field("current_timestamp(6)", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.transaction_stop_failed.stop_value</code>.
     */
    public final TableField<TransactionStopFailedRecord, String> STOP_VALUE = createField(DSL.name("stop_value"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.transaction_stop_failed.stop_reason</code>.
     */
    public final TableField<TransactionStopFailedRecord, String> STOP_REASON = createField(DSL.name("stop_reason"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.transaction_stop_failed.fail_reason</code>.
     */
    public final TableField<TransactionStopFailedRecord, String> FAIL_REASON = createField(DSL.name("fail_reason"), SQLDataType.CLOB.defaultValue(DSL.inline("NULL", SQLDataType.CLOB)), this, "");

    private TransactionStopFailed(Name alias, Table<TransactionStopFailedRecord> aliased) {
        this(alias, aliased, null);
    }

    private TransactionStopFailed(Name alias, Table<TransactionStopFailedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>stevedb.transaction_stop_failed</code> table
     * reference
     */
    public TransactionStopFailed(String alias) {
        this(DSL.name(alias), TRANSACTION_STOP_FAILED);
    }

    /**
     * Create an aliased <code>stevedb.transaction_stop_failed</code> table
     * reference
     */
    public TransactionStopFailed(Name alias) {
        this(alias, TRANSACTION_STOP_FAILED);
    }

    /**
     * Create a <code>stevedb.transaction_stop_failed</code> table reference
     */
    public TransactionStopFailed() {
        this(DSL.name("transaction_stop_failed"), null);
    }

    public <O extends Record> TransactionStopFailed(Table<O> child, ForeignKey<O, TransactionStopFailedRecord> key) {
        super(child, key, TRANSACTION_STOP_FAILED);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Stevedb.STEVEDB;
    }

    @Override
    public TransactionStopFailed as(String alias) {
        return new TransactionStopFailed(DSL.name(alias), this);
    }

    @Override
    public TransactionStopFailed as(Name alias) {
        return new TransactionStopFailed(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TransactionStopFailed rename(String name) {
        return new TransactionStopFailed(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TransactionStopFailed rename(Name name) {
        return new TransactionStopFailed(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, DateTime, TransactionStopFailedEventActor, DateTime, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}