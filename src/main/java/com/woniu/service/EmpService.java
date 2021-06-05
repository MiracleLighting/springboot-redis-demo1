package com.woniu.service;

import com.woniu.entity.Emp;

import java.util.List;

public interface EmpService {

    List<Emp> findAll();

    Emp findById(Integer empid);

    int insert(Emp emp);

    int updateById(Emp emp);
}
