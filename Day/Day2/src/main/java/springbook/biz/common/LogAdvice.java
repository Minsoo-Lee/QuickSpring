package springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
    @Pointcut("execution(* springbook.biz..*Impl.*(..))")
    public void allPointcut() {}

    @Before("allPointcut()")
    public void printLog() {
        System.out.println("[common log] work before business logic");
    }
}
