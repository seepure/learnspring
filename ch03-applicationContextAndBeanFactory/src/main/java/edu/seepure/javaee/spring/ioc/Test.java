package edu.seepure.javaee.spring.ioc;

import edu.seepure.javaee.spring.ioc.bean.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 1.如果使用ApplicationContext ，则配置的bean如果是 singlton不管你用不用，都被实例化.(好处就是可以预先加载,缺点就是耗内存)
 *
 * 2.如果是 BeanFactory ,则当你获取beanfacotry时候，配置的bean不会被马上实例化，当你使用的时候，才被实例(好处节约内存,缺点就是速度)
 *
 * 3.规定: 一般没有特殊要求，应当使用ApplicatioContext完成(90%)
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
