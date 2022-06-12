/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables;


import java.util.Arrays;
import java.util.List;

import jooq.steve.db.Keys;
import jooq.steve.db.Stevedb;
import jooq.steve.db.tables.records.ConnectorRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Connector extends TableImpl<ConnectorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>stevedb.connector</code>
     */
    public static final Connector CONNECTOR = new Connector();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConnectorRecord> getRecordType() {
        return ConnectorRecord.class;
    }

    /**
     * The column <code>stevedb.connector.connector_pk</code>.
     */
    public final TableField<ConnectorRecord, Integer> CONNECTOR_PK = createField(DSL.name("connector_pk"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>stevedb.connector.charge_box_id</code>.
     */
    public final TableField<ConnectorRecord, String> CHARGE_BOX_ID = createField(DSL.name("charge_box_id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>stevedb.connector.connector_id</code>.
     */
    public final TableField<ConnectorRecord, Integer> CONNECTOR_ID = createField(DSL.name("connector_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private Connector(Name alias, Table<ConnectorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Connector(Name alias, Table<ConnectorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>stevedb.connector</code> table reference
     */
    public Connector(String alias) {
        this(DSL.name(alias), CONNECTOR);
    }

    /**
     * Create an aliased <code>stevedb.connector</code> table reference
     */
    public Connector(Name alias) {
        this(alias, CONNECTOR);
    }

    /**
     * Create a <code>stevedb.connector</code> table reference
     */
    public Connector() {
        this(DSL.name("connector"), null);
    }

    public <O extends Record> Connector(Table<O> child, ForeignKey<O, ConnectorRecord> key) {
        super(child, key, CONNECTOR);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Stevedb.STEVEDB;
    }

    @Override
    public Identity<ConnectorRecord, Integer> getIdentity() {
        return (Identity<ConnectorRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ConnectorRecord> getPrimaryKey() {
        return Keys.KEY_CONNECTOR_PRIMARY;
    }

    @Override
    public List<UniqueKey<ConnectorRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_CONNECTOR_CONNECTOR_PK_UNIQUE, Keys.KEY_CONNECTOR_CONNECTOR_CBID_CID_UNIQUE);
    }

    @Override
    public List<ForeignKey<ConnectorRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_CONNECTOR_CHARGE_BOX_CBID);
    }

    private transient ChargeBox _chargeBox;

    public ChargeBox chargeBox() {
        if (_chargeBox == null)
            _chargeBox = new ChargeBox(this, Keys.FK_CONNECTOR_CHARGE_BOX_CBID);

        return _chargeBox;
    }

    @Override
    public Connector as(String alias) {
        return new Connector(DSL.name(alias), this);
    }

    @Override
    public Connector as(Name alias) {
        return new Connector(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Connector rename(String name) {
        return new Connector(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Connector rename(Name name) {
        return new Connector(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
