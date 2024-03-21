package com.asouwn.highconcurrency.server;

import com.asouwn.highconcurrency.POJO.Mood;

import java.util.List;

public interface MoodServer {
    List<Mood> listAll();
}
