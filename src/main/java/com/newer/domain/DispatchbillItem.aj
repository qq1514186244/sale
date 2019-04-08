package com.newer.domain;

import java.io.Serializable;
//发货细项
public aspect DispatchbillItem implements Serializable {
    private int dbiid;
    private Dispatchbill dispatchbill;
    private DrugItem drugItem;
    private String dbiquantity;

    public int getDbiid() {
        return dbiid;
    }

    public void setDbiid(int dbiid) {
        this.dbiid = dbiid;
    }

    public Dispatchbill getDispatchbill() {
        return dispatchbill;
    }

    public void setDispatchbill(Dispatchbill dispatchbill) {
        this.dispatchbill = dispatchbill;
    }

    public DrugItem getDrugItem() {
        return drugItem;
    }

    public void setDrugItem(DrugItem drugItem) {
        this.drugItem = drugItem;
    }

    public String getDbiquantity() {
        return dbiquantity;
    }

    public void setDbiquantity(String dbiquantity) {
        this.dbiquantity = dbiquantity;
    }
}
