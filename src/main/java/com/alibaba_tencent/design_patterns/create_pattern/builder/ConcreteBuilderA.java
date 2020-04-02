package com.alibaba_tencent.design_patterns.create_pattern.builder;

import java.math.BigDecimal;

/**
 * @ClassName: ConcreteBuilderA
 * @Desc: 具体创建者A
 * @Author: ChenYong
 * @Date: 2020-04-02 15:55
 */
public class ConcreteBuilderA extends Builder {

    @Override
    protected void buildPartName() {
        product.setName("产品A");
    }

    @Override
    protected void buildPartPrice() {
        product.setPrice(new BigDecimal("999.99"));
    }

    @Override
    protected void buildPartSize() {
        product.setSize(168);
    }
}
