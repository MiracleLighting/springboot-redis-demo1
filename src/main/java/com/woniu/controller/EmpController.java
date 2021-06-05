package com.woniu.controller;

import com.woniu.entity.Emp;
import com.woniu.entity.Result;
import com.woniu.entity.ResultCode;
import com.woniu.service.EmpService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmpController {

    @Resource
    private EmpService empService;

    @RequestMapping("/findAll")
    @ResponseBody
    //@Cacheable(cacheNames = "empAll",key = "#root.methodName")
    @Cacheable(cacheNames = "emp", key = "#root.methodName") //empAll::empQueryAll
    public Result empQueryAll() {
        System.out.println("EmpController.empQueryAll");
        List<Emp> emps = empService.findAll();
        return new Result(ResultCode.SUCCESS,emps);
    }

    @RequestMapping("/findById")
    @ResponseBody
    @Cacheable(cacheNames = "emp", key = "#empid") //empById::1
    public Result empQueryById(Integer empid) {
        System.out.println("EmpController.empQueryById");
        Emp emp = empService.findById(empid);
        return new Result(ResultCode.SUCCESS,emp);
    }

    @RequestMapping("/insert")
    @ResponseBody
    @CachePut(cacheNames = "emp", key = "#emp.empname")
    public Result empInsert(Emp emp) {
        System.out.println("EmpController.empInsert");
        System.out.println("Dream It Possible");

        int i = empService.insert(emp);
        return new Result(ResultCode.SUCCESS,i);
    }

    @RequestMapping("/updateById")
    @ResponseBody
    @CacheEvict(cacheNames = "emp", allEntries = true)
    public Result empUpdateById(Emp emp) {
        System.out.println("EmpController.empUpdateById");
        System.out.println("test Git");
        System.out.println("test Git2");
        System.out.println("test Git3");
        System.out.println("合抱之木，生于毫末");
        System.out.println("master");
        System.out.println("hot-fix2");
        System.out.println("天道酬勤");

        int i = empService.updateById(emp);
        return new Result(ResultCode.SUCCESS,i);
    }
}
