package com.example.colordetails.service;

import com.example.colordetails.entity.User;
import com.example.colordetails.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    //登陆
    @Override
    public User login(String username, String password) {
        return userRepository.login(username,password);
    }
    //根据id删除用户
    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    //用户注册
    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

}
