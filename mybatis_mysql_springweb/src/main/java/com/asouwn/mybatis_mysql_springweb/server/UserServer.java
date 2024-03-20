package com.asouwn.mybatis_mysql_springweb.server;

import com.asouwn.mybatis_mysql_springweb.POJO.User;

import java.util.List;

public interface UserServer {
    List<User> listAll();

}
