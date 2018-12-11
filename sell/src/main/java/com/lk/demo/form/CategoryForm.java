package com.lk.demo.form;

import lombok.Data;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/30
 * Time:21:54
 */
@Data
public class CategoryForm {
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
