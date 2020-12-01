package com.faon.springcloud.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface TableService {

    String  getTable(String daoName);
}
