package com.alibaba_tencent.design_patterns.structural_pattern.bridge;

/**
 * @ClassName: ConcreteImplementorA
 * @Desc: 桥接模式 具体实现化类A
 * @Author: Chen Yong
 * @Date: 2020-04-08 9:54
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("具体实现化A角色被访问");
    }
}
