package com.lk.demo.controller;

import com.lk.demo.VO.ProductInfoVO;
import com.lk.demo.VO.ProductVO;
import com.lk.demo.VO.ResultVO;
import com.lk.demo.dataobject.ProductCategory;
import com.lk.demo.dataobject.ProductInfo;
import com.lk.demo.service.CategoryService;
import com.lk.demo.service.ProductService;
import com.lk.demo.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/15
 * Time:22:05
 */
@RestController        //json格式的controller
@RequestMapping("buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list(){

        //1。 查新所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2. 查询类目（一次查询）
  //      List<Integer> categoryTypeList = new ArrayList<>();
        //传统方法
  //      for(ProductInfo productInfo : productInfoList){
  //          categoryTypeList.add(productInfo.getCategoryType());
  //      }
        //精简方法(java8, lambda)
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        //3. 数据拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory: productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo: productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);   //将productInfo的信息复制到productInfoVO
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        System.err.println(productVOList);
        return ResultVOUtil.success(productVOList);
    }

}
