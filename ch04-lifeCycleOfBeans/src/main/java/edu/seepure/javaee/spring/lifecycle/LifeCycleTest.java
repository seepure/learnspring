package edu.seepure.javaee.spring.lifecycle;

import edu.seepure.javaee.spring.lifecycle.util.SpringUtil;

/**
 * The life cycle of SpringAwareBean is below:
 * 1) SpringAwareBean constructed
 * 2) SpringAwareBean setP1
 * 3) SpringAwareBean springAwareBean
 * 4) SpringAwareBean org.springframework.beans.factory.support.DefaultListableBeanFactory@13c78c0b: defining beans [person,student,springAwareBean,edu.seepure.javaee.spring.lifecycle.MyBeanPostProcessor#0]; root of factory hierarchy
 * 5) SpringAwareBean org.springframework.context.support.ClassPathXmlApplicationContext@1d56ce6a: startup date [Sun Aug 13 00:45:32 CST 2017]; root of context hierarchy
 * 6) MyBeanPostProcessor postProcessBeforeInitialization. springAwareBean edu.seepure.javaee.spring.lifecycle.bean.SpringAwareBean@544fe44c
 * 7) SpringAwareBean init method
 * 8) MyBeanPostProcessor postProcessAfterInitialization. springAwareBean edu.seepure.javaee.spring.lifecycle.bean.SpringAwareBean@544fe44c
 * 9) SpringAwareBean destroy method
 *
 * Note:
 * 1) SpringAware interfaces is not recommended because they couples your code with spring which is not the IOC style.
 * 2) BeanPostProcessor interface
 * 3) default init/destroy method in "<beans default-init-method="init" default-destroy-method="destroy" ...\>"
 * 4) self init/destroy method in "<bean init-method="studentInit" />"
 */
public class LifeCycleTest {

    public static void main(String[] args) {
        SpringUtil.init("beans.xml");
        SpringUtil.destroy();
    }
}
