package com.asouwn.highconcurrency.server;

import com.asouwn.highconcurrency.POJO.User;

public interface UserServer {
    User find(int id);
}
