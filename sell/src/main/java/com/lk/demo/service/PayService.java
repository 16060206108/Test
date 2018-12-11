package com.lk.demo.service;

import com.lk.demo.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/11/1
 * Time:16:42
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse  notify(String notifyData);

}
