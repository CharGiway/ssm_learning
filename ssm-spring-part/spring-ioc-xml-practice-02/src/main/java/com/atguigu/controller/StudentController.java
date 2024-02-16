package com.atguigu.controller;

import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService;
    public void findAll(){
        List<Student> all = studentService.findAll();
        System.out.println("最终学院数据"+all);
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}
