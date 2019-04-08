package com.newer.domain;

import java.io.Serializable;
//卫生局
public class Derpatment implements Serializable {
    private int dpid;
    private String dpname;
    private String dpaddress;

    public int getDpid() {
        return dpid;
    }

    public void setDpid(int dpid) {
        this.dpid = dpid;
    }

    public String getDpname() {
        return dpname;
    }

    public void setDpname(String dpname) {
        this.dpname = dpname;
    }

    public String getDpaddress() {
        return dpaddress;
    }

    public void setDpaddress(String dpaddress) {
        this.dpaddress = dpaddress;
    }
}
