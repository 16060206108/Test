package com.lk.demo.enums;

import lombok.Getter;

/**
 * 商品状态
 *
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/12
 * Time:15:57
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"上架"),
    DOWN(1,"下架")
    ;

    private Integer Code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        Code = code;
        this.message = message;
    }
}
