package com.springboot.joyson.demospringbootmybatis.dao;

import com.springboot.joyson.demospringbootmybatis.entity.User;
import com.springboot.joyson.demospringbootmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMapperDao {

    @Autowired
    private UserMapper userMapper;

    public User findById(int id)
    {
        return userMapper.findById(id);
    }
}
