package com.asouwn.mybatis_mysql_springweb.server.impl;

import com.asouwn.mybatis_mysql_springweb.POJO.User;
import com.asouwn.mybatis_mysql_springweb.mapper.UserMapper;
import com.asouwn.mybatis_mysql_springweb.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServerImpl implements UserServer {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAll() {
        return userMapper.listAll();
    }
}
