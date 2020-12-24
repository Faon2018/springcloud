package com.faon.springcloud.service.impl;

import com.faon.springcloud.dao.PermissionDao;
import com.faon.springcloud.entities.Permission;
import com.faon.springcloud.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public List<Permission> getPermissionsByRoleIds(int[] roleId) {
        return permissionDao.selectPermissionsByRoleIds(roleId);
    }
}
