package com.faon.springcloud.entities;

import java.util.List;

public class Menu {
    private Integer id;
    private String name;
    private String url;
    private Integer sort;
    private Integer parentId;
    private Integer status;
    private List<Menu> childrenMenus;
    private Menu parentMenu;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Menu> getChildrenMenus() {
        return childrenMenus;
    }

    public void setChidrenMenus(List<Menu> childrenMenus) {
        this.childrenMenus = childrenMenus;
    }

    public void setChildrenMenus(List<Menu> childrenMenus) {
        this.childrenMenus = childrenMenus;
    }

    public Menu getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(Menu parentMenu) {
        this.parentMenu = parentMenu;
    }

    @Override
    public String toString() {
        return "SystemMenu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", sort=" + sort +
                ", parentId=" + parentId +
                ", status=" + status +
                ", childrenMenus=" + childrenMenus +
                ", parentMenu=" + parentMenu +
                '}';
    }
}
