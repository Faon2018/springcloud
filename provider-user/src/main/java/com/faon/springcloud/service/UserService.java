package com.faon.springcloud.service;

import com.faon.springcloud.entities.User;


public interface UserService {

    User selectUserById(int userId);

    User selectUserByUserName(String username);
}
