package com.newer.mapper;

import com.newer.domain.Dispatchbill;
import com.newer.domain.DispatchbillItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DispatchBillMapper {

    @ResultMap(value = "com.newer.mapper.DispatchBillMapper.dispatchbilltem1")
    @Select("select d.dname,di.diquantity,di.disumprice,sp.sname,c.cname,c.caddress,di.diid " +
            "from aadruglist dl inner join aadrugitem di inner join aadrug d " +
            "inner join aasupplier sp inner join aadispatchbillitem dbi inner join aaclinic c " +
            "where dl.dlid=di.dlid and d.did=di.did and sp.sid=d.sid and di.diid=dbi.diid " +
            "and dl.cid=c.cid and dl.dlstate='已通过审批' and sp.pid=#{pid} and dbi.diid is not null ")
    List<DispatchbillItem> fahuoqinqiu(@Param("pid")int pid);

    @Select("select sid from aasupplier where pid=#{pid}")
    int findsid(@Param("pid")int pid);

    @Insert("insert into aadispatchbill values(null,#{sid},'未发货',null,null,null)")
    int createfhd(@Param("sid")int sid);

    @Select("select * from aadispatchbill where sid=#{sid} and dbstate='未发货'")
    List<Dispatchbill> findAll(@Param("sid")int sid);

    @Insert("insert into aadispatchbillitem values(null,#{dbid},#{diid},#{dbiquantity})")
    int adddbi(@Param("dbid")int dbid,@Param("diid")int diid,@Param("dbiquantity")int dbiquantity);
}
