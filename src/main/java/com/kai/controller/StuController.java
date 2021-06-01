package com.kai.controller;

import com.kai.entity.Student;
import com.kai.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuController {

    @Autowired
    private StudentService studentService;

    /**
     *    * 测试方法
     *    * @return
     *   
     */
    @RequestMapping("/hello")
    public String hello() {
        return "springboot-mybatis-plus hello world";
    }

    /**
     *    * 查询所有的学生信息
     *    * @return
     *   
     */
    @RequestMapping("/selectAll")
    public List<Student> selectAll() {
        List<Student> list = studentService.selectAll();
        return list;
    }

    @RequestMapping("/insert")
    public String insert() {
        int i = studentService.insert();
        return i + "";
    }
}