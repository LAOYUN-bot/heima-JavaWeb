package org.example.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.example.mapper.EmpMapper;
import org.example.pojo.Emp;
import org.example.pojo.EmpQueryParam;
import org.example.pojo.PageResult;
import org.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private EmpService empService;

//    @Override
//    public PageResult<Emp> page(Integer page, Integer pageSize) {
//
////        //方法一: 不使用PagerHelper
////        PageResult<Emp> pageResult = new PageResult<>();
////
////        pageResult.setTotal(empMapper.count());
////        pageResult.setRows(empMapper.list((page - 1) * pageSize, pageSize));
////        return pageResult;
//
//        // 方法二: 使用PagerHelper
//        // 1. 设置分页参数(PageHelper)
//        PageHelper.startPage(page,pageSize);
//
//        // 2. 执行查询
//        Page<Emp> p = (Page<Emp>) empMapper.list();
//
//        // 3. 解析查询结果，并封装
//        return new PageResult<Emp>(p.getTotal(),p.getResult());
//    }

//    @Override
//    public PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end) {
//        // 1. 设置分页参数(PageHelper)
//        PageHelper.startPage(page,pageSize);
//
//        // 2. 执行查询
//        Page<Emp> p = (Page<Emp>) empMapper.list(name,gender,begin,end);
//
//        // 3. 解析查询结果，并封装
//        return new PageResult<Emp>(p.getTotal(),p.getResult());
//    }

    @Override
    public PageResult<Emp> page(EmpQueryParam empQueryParam){
        // 1. 设置分页参数(PageHelper)
        PageHelper.startPage(empQueryParam.getPage(),empQueryParam.getPageSize());

        // 2. 执行查询
        Page<Emp> p = (Page<Emp>) empMapper.list(empQueryParam);

        // 3. 解析查询结果，并封装
        return new PageResult<Emp>(p.getTotal(),p.getResult());
    }

}
