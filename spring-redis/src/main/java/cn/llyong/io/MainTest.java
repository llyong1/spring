package cn.llyong.io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @description:
 * @author: llyong
 * @date: 2018/9/2
 * @time: 14:04
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-redis.xml");
        RedisTemplate redisTemplate = (RedisTemplate) applicationContext.getBean("redisTemplate");
        ValueOperations opsForValue = redisTemplate.opsForValue();
        opsForValue.set("lly_name","zhangsan");
        Object name = opsForValue.get("lly_name");
        System.out.println(name);
    }
}
