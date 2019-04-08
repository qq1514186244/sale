package com.newer.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PeopleMapper {
    @Select("select count(*) from aapeople where username=#{username} and password=#{password} and pstate=#{pstate}")
    int login(@Param("username") String username, @Param("password") String password,@Param("pstate")String pstate);
}
