package com.woniu.service.impl;

import com.woniu.dao.EmpDao;
import com.woniu.entity.Emp;
import com.woniu.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;

    @Override
    public List<Emp> findAll() {
        return empDao.selectByExample(null);
    }

    @Override
    public Emp findById(Integer empid) {
        return empDao.selectByPrimaryKey(empid);
    }

    @Override
    public int insert(Emp emp) {
        return empDao.insertSelective(emp);
    }

    @Override
    public int updateById(Emp emp) {
        return empDao.updateByPrimaryKeySelective(emp);
    }
}
