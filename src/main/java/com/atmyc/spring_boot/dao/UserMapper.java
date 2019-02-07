package com.atmyc.spring_boot.dao;


import com.atmyc.spring_boot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface UserMapper {

   @Select("select * from user01 where username =#{username}")
   User getUsername(@Param("username") String username);
}
