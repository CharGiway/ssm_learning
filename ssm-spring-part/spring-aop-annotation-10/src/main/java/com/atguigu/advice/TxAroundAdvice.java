package com.atguigu.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class TxAroundAdvice {
    @Around("com.atguigu.MyPointCut.pc()")
    public Object transaction(ProceedingJoinPoint proceedingJoinPoint){
        Object[] args = proceedingJoinPoint.getArgs();
        Object result = null;
        try {
            System.out.println("事务开启");
            result = proceedingJoinPoint.proceed(args);
            System.out.println("事务结束");
        } catch (Throwable e) {
            System.out.println("事务回滚");
            // 必须抛出异常
            throw new RuntimeException(e);
        }

        return result;
    }
}
