package com.asouwn.highconcurrency.mapper;

import com.asouwn.highconcurrency.POJO.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User find(int id);
}
