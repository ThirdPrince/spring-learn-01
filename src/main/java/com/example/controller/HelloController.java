package com.example.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.config.JdbcConfig;
import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 *  localhost:8080/hello
 */
@RestController
public class HelloController {


    @Autowired
    private DataSource dataSource;
//
//    @Value("${itcast.url}")
//    private String itcastUrl;
//
//    @Value("${itheima.url}")
//    private String itheimaUrl;


    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String hello(){
//        System.out.println("itcastUrl = "+itcastUrl);
//        System.out.println("itheimaUrl = "+itheimaUrl);
        System.out.println("dataSource"+dataSource);
        return  "hello spring boot";
    }

    /**
     * 根据用户id 查询 user
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryId(id);
    }
}
