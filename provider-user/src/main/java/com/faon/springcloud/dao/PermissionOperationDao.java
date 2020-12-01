package com.faon.springcloud.dao;

import com.faon.springcloud.entities.PermissionOperation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface PermissionOperationDao {
    List<PermissionOperation> findByPermissionId(@PathVariable("permissionId") int permissionId);
    List<PermissionOperation> findByOperationId(@PathVariable("operationId") int operationId);

}
