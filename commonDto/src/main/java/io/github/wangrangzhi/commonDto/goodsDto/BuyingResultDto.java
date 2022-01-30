package io.github.wangrangzhi.commonDto.goodsDto;

import lombok.Data;

import java.util.Date;

@Data
public class BuyingResultDto {


    private String buyerid;

    private String goodsid;

    private Date buyingtime;


    private String goodstype;

    private Integer buyingamount;

    private Boolean buyingResult;

    private String message;

}
