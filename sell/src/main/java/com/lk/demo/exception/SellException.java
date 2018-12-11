package com.lk.demo.exception;

import com.lk.demo.enums.ResultEnum;
import lombok.Getter;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/16
 * Time:20:19
 */
@Getter
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}
