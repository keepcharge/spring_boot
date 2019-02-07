package com.atmyc.spring_boot.test02.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;

@Mapper
public interface User2Mapper {

    @Insert("insert into user02 values(null,#{username},#{age});")
    public int addUser(@Param("username") String username, @Param("age") Integer age);


}
