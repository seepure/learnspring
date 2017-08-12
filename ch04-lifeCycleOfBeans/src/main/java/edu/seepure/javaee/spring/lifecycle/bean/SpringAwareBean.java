package edu.seepure.javaee.spring.lifecycle.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * it is not recommended to implements Spring Aware interfaces(e.g. BeanNameAware), because it couples your code
 * with Spring which does not follow the Inversion of Control style.
 */
public class SpringAwareBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    String p1;
    String p2;

    public SpringAwareBean() {
        System.out.println("SpringAwareBean constructed");
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        System.out.println("SpringAwareBean setP1");
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(getClass().getSimpleName()+" "+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(getClass().getSimpleName()+" "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(getClass().getSimpleName()+" "+applicationContext);
    }

    public void init() {
        System.out.println(getClass().getSimpleName()+" init method");
    }

    public void destroy() {
        System.out.println(getClass().getSimpleName()+" destroy method");
    }
}
