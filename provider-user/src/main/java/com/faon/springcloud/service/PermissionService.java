package com.faon.springcloud.service;

import com.faon.springcloud.entities.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> getPermissionsByUserId(int  userId);
}
