package com.asouwn.highconcurrency.server.impl;

import com.asouwn.highconcurrency.POJO.Mood;
import com.asouwn.highconcurrency.mapper.MoodMapper;
import com.asouwn.highconcurrency.server.MoodServer;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MoodServerImpl implements MoodServer {
    @Resource
    private MoodMapper moodMapper;

    @Override
    public List<Mood> listAll() {
        return moodMapper.listAll();
    }

    @Override
    public Mood find(int id) {
        return moodMapper.find(id);
    }
}
