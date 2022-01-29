package io.github.wangrangzhi.maillist.service.impl;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import io.github.wangrangzhi.maillist.dao.User;
import io.github.wangrangzhi.maillist.dto.controllerUse.InsertUserDto;
import io.github.wangrangzhi.maillist.dto.controllerUse.ListDto;
import io.github.wangrangzhi.maillist.dto.controllerUse.UserPage;
import io.github.wangrangzhi.maillist.mapper.UserMapper;
import io.github.wangrangzhi.maillist.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(InsertUserDto insertUserDto) {

        User user = new User();
        user.setId(IdUtil.simpleUUID());

        BeanUtils.copyProperties(insertUserDto, user);


        return userMapper.insert(user);
    }

    @Override
    public UserPage getUser() {

        UserPage userPage = new UserPage();
        List<User> userList = userMapper.selectList(Wrappers.emptyWrapper());
        userPage.setTotal(userList.size());
        userPage.setItems(userList);


        return userPage;
    }

    @Override
    public UserPage searchName(ListDto listDto) {


        List<User> plainUsers = userMapper.selectList(new QueryWrapper<User>().like("name", listDto.getName()));

        UserPage userPage = new UserPage();

        userPage.setTotal(plainUsers.size());
        userPage.setItems(plainUsers);
        return userPage;
    }
}
