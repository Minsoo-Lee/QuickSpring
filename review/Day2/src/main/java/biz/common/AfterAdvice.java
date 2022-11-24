package biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {
    /*
    @Pointcut("execution(* biz..*Impl.*(..))")
    public void allPointcut() {}

    @After("allPointcut()")
    public void finallyLog() {
        System.out.println("[After] : must work after business logic");
    }

     */
}
