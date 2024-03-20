package com.asouwn.mybatis_mysql_springweb.controller;

import com.asouwn.mybatis_mysql_springweb.server.impl.UserServerImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserServerImpl userServer;
    @GetMapping("/list")
    public String listAll(){
        System.out.println(userServer.listAll());
        return "invoke method listAll()";
    }
}
