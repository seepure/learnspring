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
 * 2) BeanPostProcessor interface : BeanPostProcessors operate on bean (or object) instances;
 *  that is to say, the Spring IoC container instantiates a bean instance and then BeanPostProcessors do their work.
 *  Classes that implement the BeanPostProcessor interface are special and are treated differently
 *  by the container. All BeanPostProcessors and beans that they reference directly are
 *  instantiated on startup, as part of the special startup phase of the ApplicationContext. Next,
 *  all BeanPostProcessors are registered in a sorted fashion and applied to all further beans in the
 *  container. Because AOP auto-proxying is implemented as a BeanPostProcessor itself, neither
 *  BeanPostProcessors nor the beans they reference directly are eligible for auto-proxying, and
 *  thus do not have aspects woven into them.
 * 3) default init/destroy method in "<beans default-init-method="init" default-destroy-method="destroy" ...\>"
 * 4) self init/destroy method in "<bean init-method="studentInit" />"
 */
public class LifeCycleTest {

    public static void main(String[] args) {
        SpringUtil.init("beans.xml");
        SpringUtil.destroy();
    }
}
