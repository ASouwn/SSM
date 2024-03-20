package com.asouwn.mybatis_mysql_springweb.mapper;

import com.asouwn.mybatis_mysql_springweb.POJO.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user_info")
    List<User> listAll();
}
