package com.asouwn.highconcurrency.mapper;

import com.asouwn.highconcurrency.POJO.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper

public interface UserMapper {
    @Select("select user.id from user")
    User find(int id);
}
