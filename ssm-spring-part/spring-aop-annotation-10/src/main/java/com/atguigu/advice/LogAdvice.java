package com.atguigu.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(20)
public class LogAdvice {
    @Before("execution(* com.atguigu.service.impl.*.*(..))")
    public void start(){
        System.out.println("方法开始");
    }

    @After("execution(* com.atguigu.service.impl.*.*(..))")
    public void end(){
        System.out.println("方法正常结束了");
    }

    @AfterThrowing("execution(* com.atguigu.service.impl.*.*(..))")
    public void error(){
        System.out.println("方法出错");
    }
}
