package com.faon.springcloud.service.impl;


import com.faon.springcloud.service.TableService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

//@Service
//public class TableServiceImpl implements TableService {
//    @Value("blog.table")
//    private Map<String,String> tableMap;
//
//    @Override
//    public String getTable(String entityName) {
//        if (!tableMap.containsKey(entityName) || tableMap.get(entityName).isEmpty()){
//            //数据库表未在配置中注册
//            return "";
//        }else {
//            return  tableMap.get(entityName);
//        }
//
//    }
//}
