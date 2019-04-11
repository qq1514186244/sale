package com.newer.service;

import com.newer.domain.Dispatchbill;
import com.newer.domain.DispatchbillItem;

import java.util.List;

public interface DispatchBillService {
    List<DispatchbillItem> fahuoqinqiu(int pid);

    int findsid(int pid);

    int createfhd(int sid);
    List<Dispatchbill> findAll(int sid);

    int adddbi(int dbid,int diid,int dbquantity);
}
