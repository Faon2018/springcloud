package com.faon.springcloud.dao;

import com.faon.springcloud.entities.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface PermissionDao {
    List<Permission> selectPermissionsByRoleId(@PathVariable("roleId") int roleId);
}
