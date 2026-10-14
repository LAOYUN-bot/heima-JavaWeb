package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Emp;
import org.example.pojo.EmpQueryParam;

import java.time.LocalDate;
import java.util.List;

/*
 * 员工信息
 */
@Mapper
public interface EmpMapper{
//-----------------------原始分页查询----------------------------------
//    /**
//     * 查询总记录条数
//     * @return
//     */
//    @Select("select count(*) from emp e left join dept d on e.dept_id = d.id")
//    public Long count();
//
//    /**
//     * 查询员工
//     * @param start
//     * @param pageSize
//     * @return
//     */
//    @Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id limit #{start}, #{pageSize}")
//    public List<Emp> list(Integer start, Integer pageSize);

    //----------------使用PagerHelper查询-----------------------------
//    @Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id ")
//    public List<Emp> list();

    public List<Emp> list(EmpQueryParam empQueryParam);
}
