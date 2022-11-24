package biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {
    /*
    @Pointcut("execution(* biz..*Impl.*(..))")
    public void allPointcut() {}

    @AfterThrowing(pointcut = "allPointcut()", throwing = "exceptObj")
    public void exceptionLog(JoinPoint jp, Exception exceptObj) {
        String method = jp.getSignature().getName();
        System.out.println("[After Throwing] " + method + "() except : " + exceptObj.getMessage());
    }
    */
}
