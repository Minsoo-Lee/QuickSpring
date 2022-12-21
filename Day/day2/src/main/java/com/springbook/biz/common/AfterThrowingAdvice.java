package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
    public void exceptionLog(JoinPoint jp, Exception exceptObj) {
        String method = jp.getSignature().getName();
        System.out.println(method + "() method cause exception : ");

        if (exceptObj instanceof IllegalArgumentException) {
            System.out.println("Illegal Arguments Exception");
        } else if (exceptObj instanceof NumberFormatException) {
            System.out.println("Number Format Exception");
        } else if (exceptObj instanceof Exception) {
            System.out.println("problem exception");
        }
    }
}
