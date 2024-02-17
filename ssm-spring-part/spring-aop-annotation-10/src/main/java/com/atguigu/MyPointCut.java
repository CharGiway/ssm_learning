package com.atguigu;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCut {
    @Pointcut("execution(* com..impl.*.*(..))")
    public void pc(){}
}
