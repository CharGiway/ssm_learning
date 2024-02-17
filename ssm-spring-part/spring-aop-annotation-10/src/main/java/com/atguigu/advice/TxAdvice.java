package com.atguigu.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(10)
public class TxAdvice {
    @Before("com.atguigu.MyPointCut.pc()")
    public void begin(){
        System.out.println("开启事务");
    }

    @AfterReturning("com.atguigu.MyPointCut.pc()")
    public void commit(){
        System.out.println("提交事务");
    }
    @AfterThrowing("com.atguigu.MyPointCut.pc()")

    public void Rollback(){
        System.out.println("回滚事务");
    }
};
