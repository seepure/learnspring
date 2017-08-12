package edu.seepure.javaee.spring.lifecycle.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ensure that there is only one ApplicationContext in this program.
 * Created by xiaoqiang on 2017/8/7.
 */
public class SpringUtil {

    private static ApplicationContext ac = null;

    public static ApplicationContext init(String classPath) {
        if (ac != null)
            return ac;
        synchronized (SpringUtil.class) {
            ac = new ClassPathXmlApplicationContext(classPath);
            return ac;
        }
    }

    public static ApplicationContext init(ApplicationContext acCtx) {
        if (acCtx == null) {
            throw new NullPointerException("use an empty ApplicationContext to init!");
        }
        synchronized (SpringUtil.class) {
            if (ac == null)
                ac = acCtx;
        }
        return ac;
    }

    public static Object getBean(String id) {
        if (ac == null) {
            throw new NullPointerException("please initialize ApplicationContext first!, call SpringUtil.init(..)");
        }
        return ac.getBean(id);
    }

    public static void destroy() {
        if (ac != null) {
            ((ClassPathXmlApplicationContext) ac).destroy();
            ac = null;
        }
    }
}
