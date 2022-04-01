package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * spring boot 工程都有一个启动入口
 * 并在引导类添加 SpringBootApplication
 */
@SpringBootApplication
// 扫描mybatis 所有的
@MapperScan("com.example.mapper")
//@MapperScan("com.example.mapper")
public class Application {

    public static void main(String[] args) {
       SpringApplication.run(Application.class,args);
    }
}
