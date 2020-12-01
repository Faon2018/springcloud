package com.faon.springcloud.dao;

import com.faon.springcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface UserDao {
    int addUser(@PathVariable("user") User user);
    User editUserById(@PathVariable("userId") int userId);
    int deleteUserById(@PathVariable("userId") int userId);
    User selectUserById(@PathVariable("userId") int userId);
//    User selectUserById(Map map);//每个接口控制数据表的调用
    List<User> selectUsers();

}
