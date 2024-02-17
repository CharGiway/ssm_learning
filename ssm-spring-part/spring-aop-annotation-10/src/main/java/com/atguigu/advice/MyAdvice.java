package com.atguigu.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class MyAdvice {
    @Before("com.atguigu.MyPointCut.pc()")
    public void before(JoinPoint joinPoint){
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        System.out.println("方法开始");
    }
    @AfterReturning(value = "com.atguigu.MyPointCut.pc()", returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){

    }

    @After("com.atguigu.MyPointCut.pc()")
    public void after(JoinPoint joinPoint){
    }

    @AfterThrowing(value = "com.atguigu.MyPointCut.pc()", throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint, Throwable throwable){
    }

}
