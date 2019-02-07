package com.atmyc.spring_boot.service.impl;

import com.atmyc.spring_boot.dao.UserMapper;
import com.atmyc.spring_boot.entity.User;
import com.atmyc.spring_boot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    @Override
    public void createJdbcUser() {
        jdbcTemplate.update("INSERT INTO `lu_tale`.`t_users` (`uid`, `username`, `password`, `email`, `homeUrl`, `screenName`, `created`, `activated`, `logged`, `groupName`)VALUES (?, ?, ?, ?, ?, ?, ?,?, ?, ?);",3,"hexialin","efd9d1b8bfb00e8e3647990f7d74d1d8","best_hetiao@aliyun.com","hxl","hexialin","4294967295",0,0,"visitor");

    }

    @Override
    public User getUsername(String username){
       return userMapper.getUsername(username);
    }
}
