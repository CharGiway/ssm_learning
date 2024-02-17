package com.atguigu.test;

import com.atguigu.config.JavaConfiguration;
import com.atguigu.ioc_01.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIoCTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        StudentController studentController = annotationConfigApplicationContext.getBean(StudentController.class);
        System.out.println("student = "+studentController);
    }
}
