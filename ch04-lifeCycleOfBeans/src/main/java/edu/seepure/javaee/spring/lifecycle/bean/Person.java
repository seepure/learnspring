package edu.seepure.javaee.spring.lifecycle.bean;

/**
 * Created by xiaoqiang on 2017/8/12.
 */
public class Person {
    private int age;
    private String name;

    public Person() {
        System.out.println(getClass().getSimpleName()+ " constructed.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println(getClass().getSimpleName()+ " set age");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass().getSimpleName()+ " set name");
        this.name = name;
    }

    public void init() {
        System.out.println(getClass().getSimpleName()+ " init method.");
    }

    public void destroy() {
        System.out.println(getClass().getSimpleName()+ " destroy method");
    }
}
