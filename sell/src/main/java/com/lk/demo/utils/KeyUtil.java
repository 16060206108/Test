package com.lk.demo.utils;

import java.util.Random;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/16
 * Time:20:25
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }

}
