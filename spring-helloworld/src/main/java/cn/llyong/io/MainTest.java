package cn.llyong.io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: llyong
 * @date: 2018/9/2
 * @time: 14:03
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-redis.xml");
        HelloController helloController = (HelloController) applicationContext.getBean("helloController");
        helloController.sayhello();
    }
}
