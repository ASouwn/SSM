package com.asouwn.highconcurrency.server.impl;

import com.asouwn.highconcurrency.POJO.User;
import com.asouwn.highconcurrency.mapper.UserMapper;
import com.asouwn.highconcurrency.server.UserServer;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl implements UserServer {
    @Resource
    private UserMapper userMapper;

    @Override
    public User find(int id) {
        return userMapper.find(id);
    }
}
