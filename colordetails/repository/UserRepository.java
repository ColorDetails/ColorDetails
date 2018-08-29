package com.example.colordetails.repository;

import com.example.colordetails.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("select u from User u where u.User_Name=?1 and u.Password=?2")
    User login(String username,String password);
}
