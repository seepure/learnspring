package edu.seepure.javaee.spring.di;

import edu.seepure.javaee.spring.di.bean.Department;
import edu.seepure.javaee.spring.di.bean.Employee;
import edu.seepure.javaee.spring.ioc.util.SpringUtil;

/**
 * 1. injection of list, set, map, properties
 * 2. injection by constructor
 * 3. inherit config
 * just refer to the beans.xml
 */
public class Test {
    public static void main(String[] args) {
        SpringUtil.init("beans.xml");
        Department department = (Department) SpringUtil.getBean("department");
        System.out.println(department);
        Employee employee = (Employee) SpringUtil.getBean("manager");
        System.out.println(employee);
        SpringUtil.destroy();
    }
}
