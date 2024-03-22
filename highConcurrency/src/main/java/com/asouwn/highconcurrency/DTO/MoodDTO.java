package com.asouwn.highconcurrency.DTO;

import com.asouwn.highconcurrency.POJO.Mood;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class MoodDTO extends Mood {
    /**
     * 内容
     */
    private String content;
    private int userId;
    private String userName;
    /**
     * 点赞量
     */
    private int parseNum;

}
