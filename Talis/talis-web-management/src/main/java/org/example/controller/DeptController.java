package org.example.controller;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.example.mapper.DeptMapper;
import org.example.pojo.Dept;
import org.example.pojo.Result;
import org.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public Result getDepts() {
        System.out.println("select all departments from dept");
        return Result.success(deptService.findAll());
    }

    @DeleteMapping("/depts")
//    public Result deleteDepts(HttpServletRequest request) {
//      //获得参数的方法一
//      String idStr = request.getParameter("id");
//      int id = Integer.parseInt(idStr);

//      //获得参数的方法二
//    public Result deleteDepts(@RequestParam("id")  Integer id) {

        //获得参数的方法三
    public Result deleteDepts(Integer id) {
        System.out.println("delete department by id from dept");
        deptService.deleteById(id);
        return Result.success();
    }

    @PostMapping("/depts")
    public Result insertDept(@RequestBody Dept dept){
        System.out.println("insert department to dept");
        deptService.addDept(dept);
        return Result.success();
    }

    @GetMapping("/depts/{id}")
    public Result getDeptById(@PathVariable Integer id){
        System.out.println("get department by id from dept");
        Dept dept = deptService.getById(id);
        return Result.success(dept);

    }

    @PutMapping("/depts")
    public Result updateDept(@RequestBody Dept dept){
        System.out.println("update department from dept");
        deptService.updateDept(dept);
        return Result.success();
    }
}
