package com.asouwn.highconcurrency.controller;

import com.asouwn.highconcurrency.DTO.MoodDTO;
import com.asouwn.highconcurrency.POJO.Mood;
import com.asouwn.highconcurrency.POJO.User;
import com.asouwn.highconcurrency.server.impl.MoodServerImpl;
import com.asouwn.highconcurrency.server.impl.UserServerImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("mood")
public class MoodController {
    @Resource
    private MoodServerImpl moodServer;
    @Resource
    private UserServerImpl userServer;
    @GetMapping("list")
    public String listAll(){
        List<Mood> moodList= moodServer.listAll();
        List<MoodDTO> moodDTOList = new ArrayList<>();
        for (Mood mood: moodList) {
            User user = userServer.find(mood.getUser_id());
            MoodDTO moodDTO = MoodDTO.builder()
                    .userName(user.getName())
                    .content(mood.getContent())
                    .parseNum(mood.getParse_num())
                    .userId(mood.getUser_id())
                    .build();
            moodDTOList.add(moodDTO);
        }
        return moodDTOList.toString();
    }
    @GetMapping("{moodId}/parse")
    public String parseMood(@PathVariable int  moodId){
        Mood mood = moodServer.find(moodId);
        User user = userServer.find(mood.getUser_id());
        MoodDTO moodDTO = MoodDTO.builder()
                .userName(user.getName())
                .content(mood.getContent())
                .parseNum(mood.getParse_num())
                .userId(mood.getUser_id())
                .build();

        return "parse finished "+ moodDTO.toString();
    }
}
