package com.faon.springcloud.entities;


/**
 * permission 与 permission_operation 一对多
 * permission_operation 与 operation 一对一
 */
public class PermissionOperation {
    private Integer id;
    private Integer permissionId;
    private Integer operationId;
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

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }



}
