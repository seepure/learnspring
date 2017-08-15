package edu.seepure.javaee.spring.di.bean;

/**
 * Created by xiaoqiang on 2017/8/15.
 */
public class Employee {
    private String id;
    private int age;

    public Employee() {}

    public Employee(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id='").append(id).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
