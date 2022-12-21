package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
    public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[BEFORE] : Before Business Method...");
        Object returnObj = pjp.proceed();
        System.out.println("[AFTER] : After Business Method...");
        return returnObj;
    }
}
