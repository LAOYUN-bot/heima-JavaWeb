package org.example.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.example.mapper.DeptMapper;
import org.example.mapper.EmpMapper;
import org.example.pojo.Emp;
import org.example.pojo.EmpQueryParam;
import org.example.pojo.PageResult;
import org.example.pojo.Result;
import org.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

//    /**
//     * 分页查询
//     * @param page
//     * @param pageSize
//     * @return
//     */
//    @GetMapping
//    public Result page(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer pageSize) {
//        log.info("[分页查询] page:{},pageSize:{}", page, pageSize);
//        PageResult<Emp> pageResult = empService.page(page, pageSize);
//        return Result.success(pageResult);
//    }

//    /**
//     * 条件分页查询
//     * @param page
//     * @param pageSize
//     * @param name
//     * @param gender
//     * @param begin
//     * @param end
//     * @return
//     */
//    @GetMapping
//  public Result page(@RequestParam(defaultValue = "1") Integer page,
//                     @RequestParam(defaultValue = "10") Integer pageSize,
//                     @RequestParam(required = false) String name,
//                     @RequestParam(required = false) Integer gender,
//                     @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
//                     @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
    @GetMapping
    public Result page(EmpQueryParam empQueryParam){
        log.info("[条件分页查询] empQueryParam={}", empQueryParam);
        PageResult<Emp> pageResult = empService.page(empQueryParam);
        return Result.success(pageResult);
    }
}
