package com.example.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testStr(){
        redisTemplate.opsForValue().set("str","heima");
        System.out.println("str = "+redisTemplate.opsForValue().get("str"));
    }

    @Test
    public void testHash(){

        redisTemplate.boundHashOps("h_key").put("name","heima");
        redisTemplate.boundHashOps("h_key").put("age","13");
        System.out.println("hash = "+redisTemplate.boundHashOps("h_key").keys());
        List list = redisTemplate.boundHashOps("h_key").values();
        System.out.println("list = "+list);

    }
    @Test
    public void testList(){
        redisTemplate.boundListOps("l_key").leftPush("c");
        redisTemplate.boundListOps("l_key").leftPush("b");
        redisTemplate.boundListOps("l_key").leftPush("a");
        System.out.println(redisTemplate.boundListOps("l_key").range(0,-1));
    }

    @Test
    public void testSet(){
        redisTemplate.boundSetOps("s_key").add("a","b","c");
        Set set =  redisTemplate.boundSetOps("s_key").members();
        System.out.println(set);
    }

    @Test
    public void testSortSet(){
        redisTemplate.boundZSetOps("z_key").add("a",30);
        redisTemplate.boundZSetOps("z_key").add("b",20);
        redisTemplate.boundZSetOps("z_key").add("c",10);
        System.out.println(redisTemplate.boundZSetOps("z_key").range(0,-1));

    }

}
