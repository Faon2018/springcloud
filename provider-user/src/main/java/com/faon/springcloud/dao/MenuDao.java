package com.faon.springcloud.dao;

import com.faon.springcloud.entities.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface MenuDao {

    List<Menu> selectMenusByPermissionId(@PathVariable("permissionId") int permission);
}
