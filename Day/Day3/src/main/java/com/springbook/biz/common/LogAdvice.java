package com.springbook.biz.common;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.aspectj.lang.annotation.Aspect;

@Service
@Aspect
public class LogAdvice {
    @Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
    public void allPointcut() {}

//    @Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
//    public void getPointcut() {}

    @Before("allPointcut()")
    public void printLog() {
        System.out.println("[Common Log] Before Business Logic");
    }
}
