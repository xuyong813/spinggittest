package com.springboot.joyson.demospringbootmybatis.dao;

import com.springboot.joyson.demospringbootmybatis.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM users where id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "password", column = "password")
    })
    User findById(@Param("id") int id);


    @Insert("insert into users(id,name,password) value(#{id},#{name},#{password})")
    void insertUser(@Param("id") int id, @Param("name") String name, @Param("password") String password);
}
