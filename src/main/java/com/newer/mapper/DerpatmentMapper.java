package com.newer.mapper;

import com.newer.domain.Clinic;
import com.newer.domain.Drug;
import com.newer.domain.DrugList;
import com.newer.domain.Supplier;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DerpatmentMapper {

    List<Clinic> findAllClinic(@Param("dpid") int dpid);

    List<DrugList> findAllDrugList(@Param("cid") int cid);

    @Select("select sid,sname,saddress from aasupplier")
    List<Supplier> findAllSupplier();

    List<Drug> findAllDrug(@Param("sid") int sid);

}
