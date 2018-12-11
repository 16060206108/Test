package com.lk.demo.VO;

import lombok.Data;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/15
 * Time:22:11
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;

}
