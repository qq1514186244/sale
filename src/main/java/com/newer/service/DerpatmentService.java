package com.newer.service;

import com.newer.domain.Clinic;
import com.newer.domain.Drug;
import com.newer.domain.DrugList;
import com.newer.domain.Supplier;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DerpatmentService {
    List<Clinic> findAllClinic(int dpid);
    List<DrugList> findAllDrugList(int cid);
    List<Supplier> findAllSupplier();

    List<Drug> findAllDrug(int sid);
}
