package com.lk.demo.service;

import com.lk.demo.dto.OrderDTO;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/23
 * Time:20:22
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);

}
