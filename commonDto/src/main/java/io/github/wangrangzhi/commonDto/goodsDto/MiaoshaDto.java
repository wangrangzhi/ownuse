package io.github.wangrangzhi.commonDto.goodsDto;


import lombok.Data;

import java.util.Date;

@Data
public class MiaoshaDto {

    private String randomId;
    private String UserId;
    private Date sendInTime;
    private String goodsId;
    private String Userlocation;
}
