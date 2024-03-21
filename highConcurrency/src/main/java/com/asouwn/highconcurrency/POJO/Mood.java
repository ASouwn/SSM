package com.asouwn.highconcurrency.POJO;

import lombok.Data;

@Data
public class Mood {
    private int id;
    /**
     * 内容
     */
    private String content;
    private String userId;
    /**
     * 点赞量
     */
    private String parseNum;
}
