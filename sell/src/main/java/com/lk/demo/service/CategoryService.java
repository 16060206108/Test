package com.lk.demo.service;

import com.lk.demo.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 *
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/11
 * Time:21:27
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
