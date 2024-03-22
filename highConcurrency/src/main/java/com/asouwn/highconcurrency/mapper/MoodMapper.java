package com.asouwn.highconcurrency.mapper;

import com.asouwn.highconcurrency.POJO.Mood;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MoodMapper {
    @Select("select * from mood")
    List<Mood> listAll();
    @Select("select * from mood where id = #{id}")
    Mood find(int id);
}
