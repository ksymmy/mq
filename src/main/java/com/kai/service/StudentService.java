package com.kai.service;

import com.kai.entity.Student;

import java.util.List;

public interface StudentService {
    //查询所有的学生信息
    public List<Student> selectAll();

    //插入学生信息
    public int insert();
}
