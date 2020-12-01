package com.faon.springcloud.dao;

import com.faon.springcloud.entities.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface RoleDao {

    List<Role> selectRolesByUserId(@PathVariable("userId") int userId);
}
