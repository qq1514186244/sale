package com.newer.mapper;

import com.newer.domain.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DerpatmentMapper {

    List<Clinic> findAllClinic(@Param("dpid") int dpid);

    List<DrugList> findAllDrugList(@Param("cid") int cid);

    @Select("select sid,sname,saddress from aasupplier")
    List<Supplier> findAllSupplier();

    List<Drug> findAllDrug(@Param("sid") int sid);

    @Select("select dbid,sid,dbstate,dbdate,dbwl,dbwldh from aadispatchbill")
    List<Dispatchbill>  findAllDispatchbill();

    List<Dispatchbill>  findDispatchbill(@Param("dbstate") String dbstate);

    @Update("update aadispatchbill set dbstate=#{dbstate},dbdate=now(),dbwl=#{dbwl},dbwldh=#{dbwldh} where dbid=#{dbid}")
    int updateDispatchbill(Dispatchbill dispatchbill);

    @Select("select dbid,sid,dbstate,dbdate,dbwl,dbwldh from aadispatchbill where dbid=#{dbid}")
    Dispatchbill findByDbid(@Param("dbid") int dbid);
}
