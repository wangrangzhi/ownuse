package io.github.wangrangzhi.commonDto.goodsDto;


import lombok.Data;

import java.util.Date;

@Data
public class MiaoshaDto {


    private String id;
    private String randomId;
    private String userId;
    private Date sendInTime;
    private String goodsId;
    private String userlocation;
}
