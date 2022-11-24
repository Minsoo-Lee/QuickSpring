package springbook.biz.common;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import springbook.biz.user.UserVO;

@Service
@Aspect
public class AfterReturningAdvice {
    @Pointcut("execution(* springbook.biz..*Impl.get*(..))")
    public void getPointcut() {}

    @AfterReturning(pointcut="getPointcut()", returning = "returnObj")
    public void afterLog(JoinPoint jp, Object returnObj) {
        String method = jp.getSignature().getName();
        if (returnObj instanceof UserVO) {
            UserVO user = (UserVO) returnObj;
            System.out.println(user.getName() + " 로그인");
        }
        System.out.println("[After Running] " + method + "() return : " + returnObj.toString());
    }
}
