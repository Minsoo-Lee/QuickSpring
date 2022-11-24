package springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {
    @Pointcut("execution(* springbook.biz..*Impl.*(..))")
    public void allPointcut() {}

    @AfterThrowing(pointcut="allPointcut()", throwing = "exceptObj")
    public void exceptionLog(JoinPoint jp, Exception exceptObj) {
        String method = jp.getSignature().getName();

        System.out.println("[Exception] while + " + method);
        /* 다양하게 예외 처리 가능 */
        if (exceptObj instanceof IllegalArgumentException) {
            System.out.println("IllegalArgumentException");
        } else if (exceptObj instanceof NumberFormatException) {
            System.out.println("NumberFormatException");
        } else if (exceptObj instanceof Exception) {
            System.out.println("Exception");
        }
    }
}
