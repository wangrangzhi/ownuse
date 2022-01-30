package io.github.wangrangzhi.processdefinition;


import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class lettuce {
    @Test
    public void test1(){
        RedisClient redisClient = RedisClient.create("redis://@localhost:6379/0");
        StatefulRedisConnection<String, String> connection = redisClient.connect();
        RedisCommands<String, String> syncCommands = connection.sync();

        syncCommands.set("key", "Hello, Redis!");

        log.info("-------------------syncCommands-------------"+syncCommands.get("key"));




        connection.close();
        redisClient.shutdown();
    }
}
