package com.lk.demo.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lk.demo.enums.ProductStatusEnum;
import com.lk.demo.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IDEA
 * author:LiKang
 * Date:2018/10/11
 * Time:21:59
 */
@Entity
@Data
@DynamicInsert
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;

    /** 名字  */
    private String productName;

    /** 单价  */
    private BigDecimal productPrice;

    /** 库存  */
    private Integer productStock;

    /** 描述 */
    private String productDescription;

    /** 小图 */
    private String productIcon;

    /** 状态，0正常1下架 */
    private Integer productStatus =ProductStatusEnum.UP.getCode();

    /** 类目编号 */
    private Integer categoryType;

    /** 创建时间. */
    private Date createTime;

    /** 更新时间. */
    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }
}
