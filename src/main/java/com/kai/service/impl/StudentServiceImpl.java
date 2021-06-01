package com.kai.service.impl;

import com.kai.entity.Student;
import com.kai.mapper.StuDao;
import com.kai.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StuDao stuDao;

    /**
     *    * 查询所有的学生信息
     *    * @return
     *   
     */
    @Override
    public List<Student> selectAll() {
        List<Student> list = stuDao.selectList(null);
        return list;
    }

    /**
     *    * 插入学生信息
     *    * @return
     *   
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insert() {
        Student student = new Student();
        student.setName("张三");
        student.setAge(20);
        student.setBirthDay(new Date());
        int i = stuDao.insert(student);
        return i;
    }
}