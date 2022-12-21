package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {
    public void printLog(JoinPoint jp) {
        System.out.println("[Common Log] Before Business Logic");
    }
}
