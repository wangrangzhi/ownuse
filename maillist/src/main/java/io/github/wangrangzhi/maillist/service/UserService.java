package io.github.wangrangzhi.maillist.service;

import io.github.wangrangzhi.maillist.dao.User;
import io.github.wangrangzhi.maillist.dto.controllerUse.InsertUserDto;
import io.github.wangrangzhi.maillist.dto.controllerUse.ListDto;
import io.github.wangrangzhi.maillist.dto.controllerUse.UserPage;

import java.util.List;

public interface UserService {
    int addUser(InsertUserDto insertUserDto);

    UserPage getUser();

    UserPage searchName(ListDto listDto);
}
