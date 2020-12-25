package com.faon.springcloud.service;

import com.faon.springcloud.entities.User;


public interface UserService {
    int addUser(User user);
    User selectUserById(int userId);

    User selectUserByUserName(String username);
}
