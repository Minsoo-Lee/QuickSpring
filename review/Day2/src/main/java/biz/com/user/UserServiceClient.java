package biz.com.user;

import biz.com.user.impl.UserServiceImpl;
import org.h2.engine.User;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
    public static void main(String[] args) {
        // 1. Spring 컨테이너를 구동한다.
        AbstractApplicationContext container =
                new GenericXmlApplicationContext("applicationContext.xml");

        // 2. Spring 컨테이너로부터 UserServiceImpl 객체를 Lookup
        UserService userService = (UserService) container.getBean("userService");

        // 3. 로그인 기능 테스트
        UserVO vo = new UserVO();
        vo.setId("test");
        vo.setPassword("test123");

        UserVO user = userService.getUser(vo);
        if (user != null) {
            System.out.println(user.getName() + ", Welcome");
        } else {
            System.out.println("fail to login");
        }

        // 4. Spring 컨테이너를 종료
        container.close();
    }
}
