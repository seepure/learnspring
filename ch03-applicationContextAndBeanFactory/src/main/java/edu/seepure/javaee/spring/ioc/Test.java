package edu.seepure.javaee.spring.ioc;

import edu.seepure.javaee.spring.ioc.bean.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * the Difference between ApplicationContext and BeanFactory
 * ApplicationContext will create instance for every singleton bean(not lazy-init) when constructed,
 * BeanFactory will only create instance once the getBean() is called.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        BeanFactory beanFactory = new XmlBeanFactory(
                new ClassPathResource("beans.xml"));
        Student student = (Student) beanFactory.getBean("stu1");
        System.out.println(student);
    }

}
