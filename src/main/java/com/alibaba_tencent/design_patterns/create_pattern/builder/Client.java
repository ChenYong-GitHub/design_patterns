package com.alibaba_tencent.design_patterns.create_pattern.builder;

/**
 * @ClassName: Client
 * @Desc:
 * @Author: ChenYong
 * @Date: 2020-04-02 15:46
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilderA();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product.toString());
    }
}
