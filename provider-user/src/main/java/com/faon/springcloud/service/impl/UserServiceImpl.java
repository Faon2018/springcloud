package com.faon.springcloud.service.impl;


import com.faon.springcloud.dao.UserDao;
import com.faon.springcloud.entities.User;
import com.faon.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User selectUserById(int userId) {

        return userDao.selectUserById(userId);
    }
}
