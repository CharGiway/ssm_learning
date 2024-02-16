package com.atguigu.service.impl;

import com.atguigu.dao.StudentDao;
import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        List<Student> students = studentDao.queryAll();
        System.out.println("studentService:"+students);
        return students;
    }
}
