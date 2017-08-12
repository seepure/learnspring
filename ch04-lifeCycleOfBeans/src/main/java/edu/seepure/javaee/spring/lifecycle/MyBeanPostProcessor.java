package edu.seepure.javaee.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * Created by xiaoqiang on 2017/8/13.
 */
public class MyBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(getClass().getSimpleName()+ " postProcessBeforeInitialization." +  " "
            + beanName + " " + bean.toString());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(getClass().getSimpleName()+ " postProcessAfterInitialization." +  " "
                + beanName + " " + bean.toString());
        return bean;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
