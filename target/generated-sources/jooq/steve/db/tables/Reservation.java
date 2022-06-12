/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables;


import de.rwth.idsg.steve.utils.DateTimeConverter;

import java.util.Arrays;
import java.util.List;

import jooq.steve.db.Indexes;
import jooq.steve.db.Keys;
import jooq.steve.db.Stevedb;
import jooq.steve.db.tables.records.ReservationRecord;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Reservation extends TableImpl<ReservationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>stevedb.reservation</code>
     */
    public static final Reservation RESERVATION = new Reservation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationRecord> getRecordType() {
        return ReservationRecord.class;
    }

    /**
     * The column <code>stevedb.reservation.reservation_pk</code>.
     */
    public final TableField<ReservationRecord, Integer> RESERVATION_PK = createField(DSL.name("reservation_pk"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>stevedb.reservation.connector_pk</code>.
     */
    public final TableField<ReservationRecord, Integer> CONNECTOR_PK = createField(DSL.name("connector_pk"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>stevedb.reservation.transaction_pk</code>.
     */
    public final TableField<ReservationRecord, Integer> TRANSACTION_PK = createField(DSL.name("transaction_pk"), SQLDataType.INTEGER.defaultValue(DSL.inline("NULL", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>stevedb.reservation.id_tag</code>.
     */
    public final TableField<ReservationRecord, String> ID_TAG = createField(DSL.name("id_tag"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>stevedb.reservation.start_datetime</code>.
     */
    public final TableField<ReservationRecord, DateTime> START_DATETIME = createField(DSL.name("start_datetime"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.inline("NULL", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.reservation.expiry_datetime</code>.
     */
    public final TableField<ReservationRecord, DateTime> EXPIRY_DATETIME = createField(DSL.name("expiry_datetime"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.inline("NULL", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.reservation.status</code>.
     */
    public final TableField<ReservationRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private Reservation(Name alias, Table<ReservationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Reservation(Name alias, Table<ReservationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>stevedb.reservation</code> table reference
     */
    public Reservation(String alias) {
        this(DSL.name(alias), RESERVATION);
    }

    /**
     * Create an aliased <code>stevedb.reservation</code> table reference
     */
    public Reservation(Name alias) {
        this(alias, RESERVATION);
    }

    /**
     * Create a <code>stevedb.reservation</code> table reference
     */
    public Reservation() {
        this(DSL.name("reservation"), null);
    }

    public <O extends Record> Reservation(Table<O> child, ForeignKey<O, ReservationRecord> key) {
        super(child, key, RESERVATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Stevedb.STEVEDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.RESERVATION_FK_CONNECTOR_PK_RESERV_IDX, Indexes.RESERVATION_FK_IDTAG_R_IDX, Indexes.RESERVATION_RESERVATION_EXPIRY_IDX, Indexes.RESERVATION_RESERVATION_START_IDX, Indexes.RESERVATION_RESERVATION_STATUS_IDX);
    }

    @Override
    public Identity<ReservationRecord, Integer> getIdentity() {
        return (Identity<ReservationRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ReservationRecord> getPrimaryKey() {
        return Keys.KEY_RESERVATION_PRIMARY;
    }

    @Override
    public List<UniqueKey<ReservationRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_RESERVATION_RESERVATION_PK_UNIQUE, Keys.KEY_RESERVATION_TRANSACTION_PK_UNIQUE);
    }

    @Override
    public List<ForeignKey<ReservationRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_CONNECTOR_PK_RESERV, Keys.FK_TRANSACTION_PK_R, Keys.FK_RESERVATION_OCPP_TAG_ID_TAG);
    }

    private transient Connector _connector;
    private transient TransactionStart _transactionStart;
    private transient OcppTag _ocppTag;

    public Connector connector() {
        if (_connector == null)
            _connector = new Connector(this, Keys.FK_CONNECTOR_PK_RESERV);

        return _connector;
    }

    public TransactionStart transactionStart() {
        if (_transactionStart == null)
            _transactionStart = new TransactionStart(this, Keys.FK_TRANSACTION_PK_R);

        return _transactionStart;
    }

    public OcppTag ocppTag() {
        if (_ocppTag == null)
            _ocppTag = new OcppTag(this, Keys.FK_RESERVATION_OCPP_TAG_ID_TAG);

        return _ocppTag;
    }

    @Override
    public Reservation as(String alias) {
        return new Reservation(DSL.name(alias), this);
    }

    @Override
    public Reservation as(Name alias) {
        return new Reservation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Reservation rename(String name) {
        return new Reservation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Reservation rename(Name name) {
        return new Reservation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, Integer, String, DateTime, DateTime, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
