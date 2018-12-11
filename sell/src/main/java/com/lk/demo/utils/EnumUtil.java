package com.lk.demo.utils;

import com.lk.demo.enums.CodeEnum;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/24
 * Time:20:48
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

}
