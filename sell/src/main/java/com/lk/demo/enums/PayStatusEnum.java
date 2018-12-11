package com.lk.demo.enums;

import lombok.Getter;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/16
 * Time:15:55
 */
@Getter
public enum PayStatusEnum implements CodeEnum{

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
