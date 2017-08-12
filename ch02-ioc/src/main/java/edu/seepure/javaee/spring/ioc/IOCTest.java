package edu.seepure.javaee.spring.ioc;

import edu.seepure.javaee.spring.ioc.service.AppleService;
import edu.seepure.javaee.spring.ioc.service.DataService;
import edu.seepure.javaee.spring.ioc.util.SpringUtil;

/**
 * 1. How to build an IOC container, and how IOC container work.
 * the implementation of the beans initialization in spring is there in DefaultListableBeanFactory.preInstantiateSingletons()
 *    1) the method use an map to record the definition of our spring config file(e.g. applicationContext.xml), this map is mergedBeanDefinitions
 *    Map from bean name to merged RootBeanDefinition
 *    private final Map<String, RootBeanDefinition> mergedBeanDefinitions =
 *    new ConcurrentHashMap<String, RootBeanDefinition>(256);
 *    2) AbstractBeanFactory.doGetBean() was used to get or create instances of beans.
 *
 * 2. How to decouple by DI(IOC)
 * it is advocated in spring that we program by interface rather than implementation, which obviously decouples the dependencies
 * in our program.
 */
public class IOCTest {


    public static void main(String[] args) {
        //1. use the debug mode to see how IOC container works
        SpringUtil.init("applicationContext.xml");
        AppleService appleService = (AppleService) SpringUtil.getBean("appleService");
        System.out.println(appleService);

        //2. the example demonstrate the decoupling power of DI
        DataService dataService = (DataService) SpringUtil.getBean("dataService");
        dataService.getData();
    }
}
