package edu.seepure.javaee.spring.quickstart.service;

/**
 * Created by xiaoqiang on 2017/8/6.
 */
public class UserService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("hello, name: "+name);
    }
}
