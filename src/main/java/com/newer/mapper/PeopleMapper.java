package com.newer.mapper;

import com.newer.domain.People;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PeopleMapper {
    @Select("select count(*) from aapeople where username=#{username} and password=#{password} and pstate=#{pstate}")
    int login(@Param("username") String username, @Param("password") String password,@Param("pstate")String pstate);
    @Select("select * from aapeople where username=#{username} and password=#{password} and pstate=#{pstate}")
    People loginer(@Param("username") String username, @Param("password") String password, @Param("pstate")String pstate);
    @Update("update set password=#{password} where pid=#{pid}")
    int changepwd(@Param("password")String password,@Param("pid")int pid);
}
