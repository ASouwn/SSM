package com.asouwn.highconcurrency.controller;

import com.asouwn.highconcurrency.server.impl.MoodServerImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mood")
public class MoodController {
    @Resource
    private MoodServerImpl moodServer;
    @GetMapping("list")
    public String listAll(Model model){
        model.addAttribute("", moodServer.listAll());
        return "mood";
    }
//    卡在设计前端页面
}
