package com.springboot.joyson.demospringbootmybatis.mapper;

import com.springboot.joyson.demospringbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User findById(int id);
}
