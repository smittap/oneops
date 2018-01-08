/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables;


import com.oneops.crawler.jooq.cms.Indexes;
import com.oneops.crawler.jooq.cms.Keys;
import com.oneops.crawler.jooq.cms.Kloopzcm;
import com.oneops.crawler.jooq.cms.tables.records.CmCiStateRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CmCiState extends TableImpl<CmCiStateRecord> {

    private static final long serialVersionUID = 1044920522;

    /**
     * The reference instance of <code>kloopzcm.cm_ci_state</code>
     */
    public static final CmCiState CM_CI_STATE = new CmCiState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmCiStateRecord> getRecordType() {
        return CmCiStateRecord.class;
    }

    /**
     * The column <code>kloopzcm.cm_ci_state.ci_state_id</code>.
     */
    public final TableField<CmCiStateRecord, Integer> CI_STATE_ID = createField("ci_state_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cm_ci_state.state_name</code>.
     */
    public final TableField<CmCiStateRecord, String> STATE_NAME = createField("state_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * Create a <code>kloopzcm.cm_ci_state</code> table reference
     */
    public CmCiState() {
        this(DSL.name("cm_ci_state"), null);
    }

    /**
     * Create an aliased <code>kloopzcm.cm_ci_state</code> table reference
     */
    public CmCiState(String alias) {
        this(DSL.name(alias), CM_CI_STATE);
    }

    /**
     * Create an aliased <code>kloopzcm.cm_ci_state</code> table reference
     */
    public CmCiState(Name alias) {
        this(alias, CM_CI_STATE);
    }

    private CmCiState(Name alias, Table<CmCiStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmCiState(Name alias, Table<CmCiStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kloopzcm.KLOOPZCM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CM_CI_STATE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CmCiStateRecord> getPrimaryKey() {
        return Keys.CM_CI_STATE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmCiStateRecord>> getKeys() {
        return Arrays.<UniqueKey<CmCiStateRecord>>asList(Keys.CM_CI_STATE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiState as(String alias) {
        return new CmCiState(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiState as(Name alias) {
        return new CmCiState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CmCiState rename(String name) {
        return new CmCiState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CmCiState rename(Name name) {
        return new CmCiState(name, null);
    }
}