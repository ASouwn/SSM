package com.asouwn.highconcurrency;

import com.asouwn.highconcurrency.POJO.Mood;
import com.asouwn.highconcurrency.POJO.User;
import com.asouwn.highconcurrency.server.impl.MoodServerImpl;
import com.asouwn.highconcurrency.server.impl.UserServerImpl;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HighConcurrencyApplicationTests {
    @Resource
    UserServerImpl userServer;
    @Resource
    MoodServerImpl moodServer;
    @Test
    void contextLoads() {
    }

    @Test
    void serverTest(){
        User user = userServer.find(26);
        Mood mood = moodServer.listAll().get(26);
        System.out.println(user);
        System.out.println(mood);
        System.out.println(userServer.find(mood.getUser_id()));
    }

}
