package com.faon.springcloud.dao;

import com.faon.springcloud.entities.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Mapper
public interface UserRoleDao {
    List<UserRole>  selectByUserId(@PathVariable("userId") int userId);
    List<UserRole>  selectByRoleId(@PathVariable("roleId") int roleId);
}
