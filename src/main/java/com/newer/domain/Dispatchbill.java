package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;
//发货单
public class Dispatchbill implements Serializable {
    private int dbid;
    private Supplier supplier;
    private int sid;
    private String dbstate;
    private Date dbdate;
    private String dbwl;
    private String dbwldh;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getDbid() {
        return dbid;
    }

    public void setDbid(int dbid) {
        this.dbid = dbid;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getDbstate() {
        return dbstate;
    }

    public void setDbstate(String dbstate) {
        this.dbstate = dbstate;
    }

    public Date getDbdate() {
        return dbdate;
    }

    public void setDbdate(Date dbdate) {
        this.dbdate = dbdate;
    }

    public String getDbwl() {
        return dbwl;
    }

    public void setDbwl(String dbwl) {
        this.dbwl = dbwl;
    }

    public String getDbwldh() {
        return dbwldh;
    }

    public void setDbwldh(String dbwldh) {
        this.dbwldh = dbwldh;
    }
}
