package com.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//@Configuration
//@PropertySource("classpath:application.yml")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

//    @Value("${jdbc.url}")
//    String url;
//
//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//
//    @Value("${jdbc.username}")
//    String username;
//
//    @Value("${jdbc.password}")
//    String password;
//
//    @Bean
//    public DataSource dataSource(){
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setDriverClassName(driverClassName);
//        druidDataSource.setUrl(url);
//        druidDataSource.setPassword(password);
//        druidDataSource.setUsername(username);
//
//        return druidDataSource;
//    }

//    @Bean
//    public DataSource dataSource(JdbcProperties jdbcProperties){
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setDriverClassName(jdbcProperties.getDriverClassName());
//        druidDataSource.setUrl(jdbcProperties.getUrl());
//        druidDataSource.setPassword(jdbcProperties.getPassword());
//        druidDataSource.setUsername(jdbcProperties.getUsername());
//        return druidDataSource;
//    }

//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource dataSource() {
//        return new DruidDataSource();
//    }




}
