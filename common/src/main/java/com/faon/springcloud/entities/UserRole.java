package com.faon.springcloud.entities;

/**
 * user 与 user_role 一对多
 * user_role 与 role 一对一
 */
public class UserRole {
    private Integer id;
    private Integer userId;
    private Integer roleId;
    private Integer status;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}
