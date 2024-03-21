package com.asouwn.highconcurrency.POJO;

import lombok.Data;

/**
 * 点赞与说说关联表
 */
@Data
public class UserMoodParseRel {
    private int id;
    private String userId;
    private String modeId;
}
