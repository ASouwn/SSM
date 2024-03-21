package com.asouwn.highconcurrency.server.impl;

import com.asouwn.highconcurrency.POJO.UserMoodParseRel;
import com.asouwn.highconcurrency.mapper.UserMoodParseRelMapper;
import com.asouwn.highconcurrency.server.UserMoodParseRelServer;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserMoodParseRelServerImpl implements UserMoodParseRelServer {
    @Resource
    private UserMoodParseRelMapper userMoodParseRelMapper;

    @Override
    public boolean save(UserMoodParseRel userMoodParseRel) {
        return userMoodParseRelMapper.save(userMoodParseRel);
    }
}
