package com.lk.demo.dto;

import lombok.Data;

/**
 * 购物车
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/16
 * Time:20:42
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

}
