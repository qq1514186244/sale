package com.newer.domain;

import java.io.Serializable;
//用户
public class People implements Serializable {
    private int pid;
    private String pname;
    private String username;
    private String password;
    private String pstate;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPstate() {
        return pstate;
    }

    public void setPstate(String pstate) {
        this.pstate = pstate;
    }
}
