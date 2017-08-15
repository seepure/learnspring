package edu.seepure.javaee.spring.di.bean;

/**
 * Created by xiaoqiang on 2017/8/16.
 */
public class Manager extends Employee {
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString()+", level="+level;
    }
}
