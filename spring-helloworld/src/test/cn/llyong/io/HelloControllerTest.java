package cn.llyong.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: llyong
 * @date: 2018/9/2
 * @time: 13:59
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloControllerTest {

    @Test
    public void fun() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-redis.xml");
        HelloController helloController = (HelloController) applicationContext.getBean("helloController");
        helloController.sayhello();
    }
}
