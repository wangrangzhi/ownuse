package io.github.wangrangzhi.processdefinition.dto.controllerUse;

import lombok.Data;

import java.util.Date;

@Data
public class InsertUserDto {
    private String name;
    private String phone;
    private String sex;
    private Date insertdata;
}
