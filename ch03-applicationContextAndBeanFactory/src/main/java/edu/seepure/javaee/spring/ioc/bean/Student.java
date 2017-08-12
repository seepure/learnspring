package edu.seepure.javaee.spring.ioc.bean;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xiaoqiang on 2017/8/12.
 */
public class Student {
    private int age;
    private String name;
    private static AtomicInteger id = new AtomicInteger(0);

    public Student() {
        int id = Student.id.getAndIncrement();
        System.out.println("Student is constructed, id="+id);
        System.out.println(toString());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
