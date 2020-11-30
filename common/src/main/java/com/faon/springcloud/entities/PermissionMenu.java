package com.faon.springcloud.entities;


/**
 * permission 与 permission_menu 一对多
 * permission_menu 与 menu 一对一
 */
public class PermissionMenu {
    private Integer id;
    private Integer permissionId;
    private Integer menuId;
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }



}
