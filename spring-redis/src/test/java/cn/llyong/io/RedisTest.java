package cn.llyong.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: llyong
 * @date: 2018/9/2
 * @time: 13:08
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest {


    @Test
    public void fun() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-redis.xml");
        RedisTemplate redisTemplate = (RedisTemplate) applicationContext.getBean("redisTemplate");
        ValueOperations opsForValue = redisTemplate.opsForValue();
        opsForValue.set("key_name","zhangsan");
        Object key_name = opsForValue.get("key_name");
        System.out.println(key_name);
    }
}
