package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

import com.springbook.biz.user.UserVO;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterReturningAdvice {
    @Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
    public void getPointcut() {}

    @AfterReturning(pointcut = "getPointcut()", returning="returnObj")
    public void afterLog(JoinPoint jp, Object returnObj) {
        String method = jp.getSignature().getName();
        if (returnObj instanceof UserVO) {
            UserVO user = (UserVO) returnObj;
            if (user.getRole().equals("Admin")) {
                System.out.println(user.getName() + " Login(Admin)");
            }
        }

        System.out.println("[AFTER RETURNING] : " + method + "() Method Return : " + returnObj.toString());
    }
}
