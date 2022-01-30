package io.github.wangrangzhi.commonDto.goodsDto;


import lombok.Data;

import java.util.Date;

@Data
public class MiaoshaDto {

    private String id;

    private String buyerid;

    private String goodsid;

    private Date buyingtime;

    private String randomId;


    private String userlocation;


    private String goodstype;

    private Integer buyingamount;
}
