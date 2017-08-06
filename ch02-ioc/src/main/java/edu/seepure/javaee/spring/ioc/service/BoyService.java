package edu.seepure.javaee.spring.ioc.service;

/**
 * Created by xiaoqiang on 2017/8/7.
 */
public class BoyService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BoyService{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
