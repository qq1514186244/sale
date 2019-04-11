package com.newer.service;

import com.newer.domain.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DerpatmentService {
    List<Clinic> findAllClinic(int dpid);
    List<DrugList> findAllDrugList(int cid);
    List<Supplier> findAllSupplier();

    List<Drug> findAllDrug(int sid);

    List<Dispatchbill>  findAllDispatchbill();

    List<Dispatchbill>  findDispatchbill(String dbstate);

    int updateDispatchbill(Dispatchbill dispatchbill);
    Dispatchbill findByDbid(int dbid);
}
