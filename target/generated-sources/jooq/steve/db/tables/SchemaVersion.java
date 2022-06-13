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
import jooq.steve.db.tables.records.SchemaVersionRecord;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class SchemaVersion extends TableImpl<SchemaVersionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>stevedb.schema_version</code>
     */
    public static final SchemaVersion SCHEMA_VERSION = new SchemaVersion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaVersionRecord> getRecordType() {
        return SchemaVersionRecord.class;
    }

    /**
     * The column <code>stevedb.schema_version.installed_rank</code>.
     */
    public final TableField<SchemaVersionRecord, Integer> INSTALLED_RANK = createField(DSL.name("installed_rank"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>stevedb.schema_version.version</code>.
     */
    public final TableField<SchemaVersionRecord, String> VERSION = createField(DSL.name("version"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>stevedb.schema_version.description</code>.
     */
    public final TableField<SchemaVersionRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>stevedb.schema_version.type</code>.
     */
    public final TableField<SchemaVersionRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>stevedb.schema_version.script</code>.
     */
    public final TableField<SchemaVersionRecord, String> SCRIPT = createField(DSL.name("script"), SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>stevedb.schema_version.checksum</code>.
     */
    public final TableField<SchemaVersionRecord, Integer> CHECKSUM = createField(DSL.name("checksum"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>stevedb.schema_version.installed_by</code>.
     */
    public final TableField<SchemaVersionRecord, String> INSTALLED_BY = createField(DSL.name("installed_by"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>stevedb.schema_version.installed_on</code>.
     */
    public final TableField<SchemaVersionRecord, DateTime> INSTALLED_ON = createField(DSL.name("installed_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.schema_version.execution_time</code>.
     */
    public final TableField<SchemaVersionRecord, Integer> EXECUTION_TIME = createField(DSL.name("execution_time"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>stevedb.schema_version.success</code>.
     */
    public final TableField<SchemaVersionRecord, Boolean> SUCCESS = createField(DSL.name("success"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private SchemaVersion(Name alias, Table<SchemaVersionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemaVersion(Name alias, Table<SchemaVersionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>stevedb.schema_version</code> table reference
     */
    public SchemaVersion(String alias) {
        this(DSL.name(alias), SCHEMA_VERSION);
    }

    /**
     * Create an aliased <code>stevedb.schema_version</code> table reference
     */
    public SchemaVersion(Name alias) {
        this(alias, SCHEMA_VERSION);
    }

    /**
     * Create a <code>stevedb.schema_version</code> table reference
     */
    public SchemaVersion() {
        this(DSL.name("schema_version"), null);
    }

    public <O extends Record> SchemaVersion(Table<O> child, ForeignKey<O, SchemaVersionRecord> key) {
        super(child, key, SCHEMA_VERSION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Stevedb.STEVEDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.SCHEMA_VERSION_SCHEMA_VERSION_S_IDX);
    }

    @Override
    public UniqueKey<SchemaVersionRecord> getPrimaryKey() {
        return Keys.KEY_SCHEMA_VERSION_PRIMARY;
    }

    @Override
    public SchemaVersion as(String alias) {
        return new SchemaVersion(DSL.name(alias), this);
    }

    @Override
    public SchemaVersion as(Name alias) {
        return new SchemaVersion(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaVersion rename(String name) {
        return new SchemaVersion(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaVersion rename(Name name) {
        return new SchemaVersion(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, Integer, String, DateTime, Integer, Boolean> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
