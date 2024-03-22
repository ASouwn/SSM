package com.asouwn.highconcurrency.POJO;

import lombok.Data;

@Data
public class Mood {
    private int id;
    /**
     * 内容
     */
    private String content;
    private int user_id;
    /**
     * 点赞量
     */
    private int parse_num;
}
