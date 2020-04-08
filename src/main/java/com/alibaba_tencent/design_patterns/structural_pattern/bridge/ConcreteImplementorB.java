package com.alibaba_tencent.design_patterns.structural_pattern.bridge;

/**
 * @ClassName: ConcreteImplementorB
 * @Desc: 桥接模式 具体实现化类B
 * @Author: Chen Yong
 * @Date: 2020-04-08 9:55
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("具体实现化B被访问");
    }
}
