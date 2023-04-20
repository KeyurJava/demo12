package com.miit.service;

import java.util.List;

import com.miit.entity.User;

public interface UserService {

    List<User> getAllUserList();
    Boolean saveUser(User user);
}
