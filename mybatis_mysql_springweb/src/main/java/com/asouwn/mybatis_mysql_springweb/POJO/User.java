package com.asouwn.mybatis_mysql_springweb.POJO;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private int id;
    private String name;
    private String age;
}
