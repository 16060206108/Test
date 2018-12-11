package com.lk.demo.service;

import com.lk.demo.dataobject.ProductInfo;
import com.lk.demo.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/12
 * Time:15:42
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有上架商品
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * pageable 分页
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    ProductInfo onSale(String productId);

    //下架
    ProductInfo offSale(String productId);

}
