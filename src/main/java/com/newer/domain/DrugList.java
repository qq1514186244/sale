package com.newer.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.sql.Date;
//采购单
public class DrugList implements Serializable {
    private int dlid;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date dlcreattime;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date dlupdatetime;
    private String dlstate;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date examinedate;
    private String exmessage;
    private Derpatment derpatment;
    private Clinic clinic;

    public int getDlid() {
        return dlid;
    }

    public void setDlid(int dlid) {
        this.dlid = dlid;
    }

    public Date getDlcreattime() {
        return dlcreattime;
    }

    public void setDlcreattime(Date dlcreattime) {
        this.dlcreattime = dlcreattime;
    }

    public Date getDlupdatetime() {
        return dlupdatetime;
    }

    public void setDlupdatetime(Date dlupdatetime) {
        this.dlupdatetime = dlupdatetime;
    }

    public String getDlstate() {
        return dlstate;
    }

    public void setDlstate(String dlstate) {
        this.dlstate = dlstate;
    }

    public Date getExaminedate() {
        return examinedate;
    }

    public void setExaminedate(Date examinedate) {
        this.examinedate = examinedate;
    }

    public String getExmessage() {
        return exmessage;
    }

    public void setExmessage(String exmessage) {
        this.exmessage = exmessage;
    }

    public Derpatment getDerpatment() {
        return derpatment;
    }

    public void setDerpatment(Derpatment derpatment) {
        this.derpatment = derpatment;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
}
