package com.faon.springcloud.entities;

import java.util.List;

public class Permission {
    private Integer id;
    private String name;//权限节点名称
    private Integer status;//状态
    private List<Menu> menus;
    private List<Operation> operations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", menus=" + menus +
                ", operations=" + operations +
                '}';
    }
}
