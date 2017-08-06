package edu.seepure.javaee.spring.ioc.service;

/**
 * Created by xiaoqiang on 2017/8/7.
 */
public class AppleService {
    private String name;
    private BoyService boyService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BoyService getBoyService() {
        return boyService;
    }

    public void setBoyService(BoyService boyService) {
        this.boyService = boyService;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppleService{");
        sb.append("name='").append(name).append('\'');
        sb.append(", boyService=").append(boyService);
        sb.append('}');
        return sb.toString();
    }
}
