package com.springbook.biz.common;

public class AfterThrowingAdvice {
    public void exceptionLog() {
        System.out.println("[AFTER THROWING] Exception While Business Logic");
    }
}
