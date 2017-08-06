package edu.seepure.javaee.spring.quickstart;

import edu.seepure.javaee.spring.quickstart.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiaoqiang on 2017/8/6.
 */
public class HelloSpring {

    public static void main(String[] args) {
        //1. by the traditional approach, we create an instance in
        //our own code, use "new"
        UserService service = new UserService();
        service.setName("tradition");
        service.show();

        //2. now let spring to manager our object/beans/instance,
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.show();
    }
}
