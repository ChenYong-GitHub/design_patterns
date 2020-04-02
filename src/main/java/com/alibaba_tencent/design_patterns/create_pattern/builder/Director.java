package com.alibaba_tencent.design_patterns.create_pattern.builder;

/**
 * @ClassName: Director
 * @Desc: 指挥者
 * @Author: ChenYong
 * @Date: 2020-04-02 15:52
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartName();
        builder.buildPartPrice();
        builder.buildPartSize();
        return builder.getProduct();
    }

}
