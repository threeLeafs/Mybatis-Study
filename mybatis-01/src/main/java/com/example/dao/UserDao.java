package com.example.dao;

import com.example.pojo.User;

import java.util.List;

public interface UserDao {

    List<User> getUserList();

    User getUserById(int id);

    void addUser(User user);

    void updateUser(User user);
    void deleteUserById(int id);
 }
