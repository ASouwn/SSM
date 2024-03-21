package com.asouwn.highconcurrency.mapper;

import com.asouwn.highconcurrency.POJO.UserMoodParseRel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMoodParseRelMapper {
    @Insert("insert into user_mood_rel (id, mood_id, user_id) VALUE (#{id}, #{mood_id}, #{user_id})")
    boolean save(UserMoodParseRel userMoodParseRel);
}
