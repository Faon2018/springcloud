package com.faon.springcloud.dao;

import com.faon.springcloud.entities.Operation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface OperationDao {

    List<Operation> selectOperationsByPermissionId(@PathVariable("permissionId") int permissionId);

}
