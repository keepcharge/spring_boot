package com.atmyc.spring_boot.test01.service;

import com.atmyc.spring_boot.test01.dao.User1Mapper;
import com.atmyc.spring_boot.test01.entity.User1;
import com.atmyc.spring_boot.test02.dao.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class User1Service {

    @Autowired
    private User1Mapper user1Mapper;
    @Autowired
    private User2Mapper user2Mapper;

    public int addUser(String username,Integer age){
        return user1Mapper.addUser(username,age);
    }

    @Transactional
    public int transUser(String username,Integer age){
        user2Mapper.addUser(username,age);
        int i =1/0;
        int result = user1Mapper.addUser(username,age);
        return  result;
    }

    public List<User1> findUser(){
        return user1Mapper.findUser();
    }
}
