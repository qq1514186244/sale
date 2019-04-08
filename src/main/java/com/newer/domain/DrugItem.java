package com.newer.domain;

import java.io.Serializable;
//采购细项
public class DrugItem implements Serializable {
    private  int diid;
    private DrugList drugList;
    private String diquantity;
    private Drug drug;
    private double disumprice;

    public int getDiid() {
        return diid;
    }

    public void setDiid(int diid) {
        this.diid = diid;
    }

    public DrugList getDrugList() {
        return drugList;
    }

    public void setDrugList(DrugList drugList) {
        this.drugList = drugList;
    }

    public String getDiquantity() {
        return diquantity;
    }

    public void setDiquantity(String diquantity) {
        this.diquantity = diquantity;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public double getDisumprice() {
        return disumprice;
    }

    public void setDisumprice(double disumprice) {
        this.disumprice = disumprice;
    }
}
