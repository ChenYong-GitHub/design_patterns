package com.alibaba_tencent.design_patterns.create_pattern.builder;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName: Product
 * @Desc: 产品类
 * @Author: ChenYong
 * @Date: 2020-04-02 15:47
 */
@Data
public class Product {

    private String name;
    private BigDecimal price;
    private int size;

}
