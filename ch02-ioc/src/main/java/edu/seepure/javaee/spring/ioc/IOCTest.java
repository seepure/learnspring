package edu.seepure.javaee.spring.ioc;

import edu.seepure.javaee.spring.ioc.service.AppleService;
import edu.seepure.javaee.spring.ioc.util.SpringUtil;

/**
 * Created by xiaoqiang on 2017/8/7.
 */
public class IOCTest {
    public static void main(String[] args) {
        SpringUtil.init("applicationContext.xml");
        AppleService appleService = (AppleService) SpringUtil.getBean("appleService");
        System.out.println(appleService);
    }
}
