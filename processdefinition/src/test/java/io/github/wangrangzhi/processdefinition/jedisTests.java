package io.github.wangrangzhi.processdefinition;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.resps.Tuple;

import java.util.*;

@Slf4j
class jedisTests {


    Jedis jedis = getJedis();

    public Jedis getJedis() {
        JedisPool pool = new JedisPool("localhost", 6379);
        Jedis jedis = pool.getResource();
        return jedis;

    }

    @Test
    public void test1() {
        String a = getJedis().set("clientName", "Jedis");
        log.info(a);

        String b = getJedis().get("clientName");
        log.info("b:" + b);


        //存储数据到列表中
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0, 2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("列表项为: " + list.get(i));
        }

        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key);
        }

    }

    @Test
    public void HashTest() {


        Map<String, String> data = new HashMap<>();
        data.put("name", "zhangsan");
        data.put("gender", "man");
        jedis.hmset("person", data);

        List<String> hmget = jedis.hmget("person", "name", "gender");
        System.out.println(hmget);

        //删除
        jedis.hdel("person", "gender");

        List<String> hmget1 = jedis.hmget("person", "name", "gender");
        System.out.println(hmget1);
    }

    @Test
    public void listtest() {

        jedis.lpush("usersa", "大明", "大强", "大力");
        //获取
        List<String> users = jedis.lrange("usersa", 0, -1);
        System.out.println(users);


        String user = jedis.lindex("usersa", 0);
        System.out.println(user);

        user = jedis.rpop("usersa");
        System.out.println(user);
    }


    @Test
    public void setTest() {
        //设置
        jedis.sadd("countries", "China", "USA", "USB", "USC");

        //获取
        Set<String> countries = jedis.smembers("countries");
        System.out.println(countries);
    }

    @Test
    public void zsetTest() {


        jedis.zadd("hot", 485, "云南1");
        jedis.zadd("hot", 484, "云南2");
        jedis.zadd("hot", 489, "云南3");

        //获取
        List<String> hot = jedis.zrange("hot", 0, -1);
        System.out.println(hot);

//        Double score = jedis.zscore("hot","云南1");
//        System.out.println(score);

        List<Tuple> hot1 = jedis.zrangeWithScores("hot", 0, 2);
        System.out.println(hot1);

        Iterator<Tuple> it = hot1.iterator();
        while (it.hasNext()) {
            Tuple tuple = it.next();
            System.out.println(tuple.getElement() + "-" + tuple.getScore());
        }
    }


    @Test
    public void hyperloglog() {

        for (int i = 0; i < 1000; i++) {
            jedis.pfadd("codehole", "user" + i);


        }
        long total = jedis.pfcount("codehole");

        jedis.del("codehole");

        log.info("total:"+total);

    }
}
