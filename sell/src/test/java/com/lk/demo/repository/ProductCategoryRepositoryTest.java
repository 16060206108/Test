package com.lk.demo.repository;

import com.lk.demo.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/10
 * Time:21:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findById(2).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional             //在测试类中回滚所有操作 数据库中不会插入数据
    public void saveTest(){
        ProductCategory category = new ProductCategory("最冷商品",7);
        ProductCategory result =repository.save(category);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4,5,6);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);

        Assert.assertNotEquals(0,result.size());
    }


}