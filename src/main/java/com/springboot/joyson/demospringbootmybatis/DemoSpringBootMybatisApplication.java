package com.springboot.joyson.demospringbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.springboot.joyson.demospringbootmybatis.mapper")
@SpringBootApplication
public class DemoSpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootMybatisApplication.class, args);
    }
}
