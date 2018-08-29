package com.example.colordetails.service;

import com.example.colordetails.entity.User;

public interface UserService {
    //用户登录
    User login(String username,String password);
    //根据id删除用户
    void deleteUserById(Integer id);
    //用户注册
    User register(User user);

}
