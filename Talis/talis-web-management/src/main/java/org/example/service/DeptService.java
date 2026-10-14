package org.example.service;

import org.example.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门数据
     * @return
     */
    List<Dept> findAll();

    /**
     * 根据id删除部门
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 根据name添加部门
     * @param dept
     */
    void addDept(Dept dept);

    /**
     * 根据id查询部门
     *
     * @param id
     * @return
     */
    Dept getById(Integer id);

    /**
     * 更新部门
     * @param dept
     */
    void updateDept(Dept dept);
}
