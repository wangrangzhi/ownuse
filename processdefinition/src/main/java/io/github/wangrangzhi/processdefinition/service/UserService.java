package io.github.wangrangzhi.processdefinition.service;

import io.github.wangrangzhi.processdefinition.dao.User;
import io.github.wangrangzhi.processdefinition.dto.controllerUse.InsertUserDto;
import io.github.wangrangzhi.processdefinition.dto.controllerUse.ListDto;
import io.github.wangrangzhi.processdefinition.dto.controllerUse.UserPage;

import java.util.List;

public interface UserService {
    int addUser(InsertUserDto insertUserDto);

    UserPage getUser();

    UserPage searchName(ListDto listDto);
}
