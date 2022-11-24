package biz.common;

import biz.com.user.UserVO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterReturningAdvice {
    /*
    @Pointcut("execution(* biz..*Impl.get*(..))")
    public void getPointcut() {}

    @AfterReturning(pointcut="getPointcut()", returning = "returnObj")
    public void afterLog(JoinPoint jp, Object returnObj) {
        String method = jp.getSignature().getName();
        if (returnObj instanceof UserVO) {
            UserVO user = (UserVO)returnObj;
            if (!user.getRole().equals("Admin")) {
                System.out.println(user.getName() + " login");
            }
        }
        System.out.println("[After Returning] " + method + "() method return : " + returnObj.toString());
    }

     */
}
