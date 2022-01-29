package io.github.wangrangzhi.maillist.mapper;

import cn.hutool.captcha.generator.RandomGenerator;
import io.github.wangrangzhi.maillist.dao.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@Slf4j

@SpringBootTest(classes = io.github.wangrangzhi.maillist.MailListApplication.class)

@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {

        User u = new User();

        u.setId(new RandomGenerator(1).generate());
        u.setName("asdrg");
        userMapper.insert(u);
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}