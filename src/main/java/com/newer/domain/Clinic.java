package com.newer.domain;

import java.io.Serializable;
//医务室
public class Clinic implements Serializable {
    private int cid;
    private String cname;
    private String caddress;
    private Derpatment derpatment;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public Derpatment getDerpatment() {
        return derpatment;
    }

    public void setDerpatment(Derpatment derpatment) {
        this.derpatment = derpatment;
    }
}
