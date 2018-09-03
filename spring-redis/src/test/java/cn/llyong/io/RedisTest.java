package cn.llyong.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: llyong
 * @date: 2018/9/2
 * @time: 13:08
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-redis.xml"})
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test1(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("first","hellow word");
        System.out.println(valueOperations.get("first"));
    }


//    @Test
//    public void fun() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-redis.xml");
//        RedisTemplate redisTemplate = (RedisTemplate) applicationContext.getBean("redisTemplate");
//        ValueOperations opsForValue = redisTemplate.opsForValue();
//        opsForValue.set("key_name","zhangsan");
//        Object key_name = opsForValue.get("key_name");
//        System.out.println(key_name);
//    }
}
