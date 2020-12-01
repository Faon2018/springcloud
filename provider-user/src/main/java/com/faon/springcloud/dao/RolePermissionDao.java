package com.faon.springcloud.dao;

import com.faon.springcloud.entities.RolePermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface RolePermissionDao {
    List<RolePermission> selectByRoleId(@PathVariable("roleId") int roleId);
    List<RolePermission> selectByPermissionId(@PathVariable("permissionId") int permissionId);

}
