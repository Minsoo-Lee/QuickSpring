package biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service // 비즈니스 로직을 처리
@Aspect // Aspect = Pointcut + Advice
public class LogAdvice {
    /*
    @Pointcut("execution(* biz..*Impl.*(..))")
    public void allPointcut() {}

    @Before("allPointcut()")
    public void printLog() {
        System.out.println("[common log] : work before business logic");
    }
     */
}
