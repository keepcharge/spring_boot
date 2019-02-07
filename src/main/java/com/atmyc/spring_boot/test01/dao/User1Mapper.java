package com.atmyc.spring_boot.test01.dao;

import com.atmyc.spring_boot.test01.entity.User1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@CacheConfig(cacheNames = "baseCache")
@Mapper
public interface User1Mapper {

    @Insert("insert into user01 values(null,#{username},#{age});")
    public int addUser(@Param("username") String username, @Param("age") Integer age);


    @Select("select * from user01")
    @Cacheable
    public List<User1> findUser();
}
