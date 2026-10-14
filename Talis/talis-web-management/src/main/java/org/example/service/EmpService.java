package org.example.service;

/*
 * 员工信息
 */

import org.example.pojo.Emp;
import org.example.pojo.EmpQueryParam;
import org.example.pojo.PageResult;

import java.time.LocalDate;

public interface EmpService {

//    /**
//     * 分页查询的方法
//     * @param page
//     * @param pageSize
//     * @return
//     */
//    PageResult<Emp> page(Integer page, Integer pageSize);

//    /**
//     * 条件分页查询的方法
//     * @param page
//     * @param pageSize
//     * @param name
//     * @param gender
//     * @param begin
//     * @param end
//     * @return
//     */
//    PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);

    /**
     * 改进的条件分页查询的方法
     * @param empQueryParam
     * @return
     */
    PageResult<Emp> page(EmpQueryParam empQueryParam);
}
