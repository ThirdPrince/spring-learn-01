package com.example.service;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryId(long id){
         return userMapper.selectByPrimaryKey(id);
    }

    // 新增保存用户
    public void saveUser(User user){
        System.out.println("新增用户");
        userMapper.insertSelective(user);
    }
}
