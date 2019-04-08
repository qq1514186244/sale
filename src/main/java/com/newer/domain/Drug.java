package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class Drug implements Serializable {
    private int did;
    private String dname;
    private Double dprice;
    private String dmessage;
    private String dwh;
    private Date dwhdate;
    private String dstate;
    private String dpackge;
    private String ddosage;
    private String dtype;
    private String dreport;
    private Date dreportdate;
    private Supplier supplier;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Double getDprice() {
        return dprice;
    }

    public void setDprice(Double dprice) {
        this.dprice = dprice;
    }

    public String getDmessage() {
        return dmessage;
    }

    public void setDmessage(String dmessage) {
        this.dmessage = dmessage;
    }

    public String getDwh() {
        return dwh;
    }

    public void setDwh(String dwh) {
        this.dwh = dwh;
    }

    public Date getDwhdate() {
        return dwhdate;
    }

    public void setDwhdate(Date dwhdate) {
        this.dwhdate = dwhdate;
    }

    public String getDstate() {
        return dstate;
    }

    public void setDstate(String dstate) {
        this.dstate = dstate;
    }

    public String getDpackge() {
        return dpackge;
    }

    public void setDpackge(String dpackge) {
        this.dpackge = dpackge;
    }

    public String getDdosage() {
        return ddosage;
    }

    public void setDdosage(String ddosage) {
        this.ddosage = ddosage;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getDreport() {
        return dreport;
    }

    public void setDreport(String dreport) {
        this.dreport = dreport;
    }

    public Date getDreportdate() {
        return dreportdate;
    }

    public void setDreportdate(Date dreportdate) {
        this.dreportdate = dreportdate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
