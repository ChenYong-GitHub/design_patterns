package com.alibaba_tencent.design_patterns.create_pattern.builder;

/**
 * @ClassName: Builder
 * @Desc: 抽象创建者
 * @Author: ChenYong
 * @Date: 2020-04-02 15:49
 */
public abstract class Builder {

    protected Product product = new Product();

    protected abstract void buildPartName();

    protected abstract void buildPartPrice();

    protected abstract void buildPartSize();

    public Product getProduct() {
        return product;
    }
}
