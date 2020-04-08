package com.alibaba_tencent.design_patterns.structural_pattern.bridge;

/**
 * @ClassName: BridgeClient
 * @Desc: 桥接模式  客户端
 * @Author: Chen Yong
 * @Date: 2020-04-08 10:00
 */
public class BridgeClient {

    public static void main(String[] args) {

        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new AbstractionImplA(implementor);
        abstraction.operation();
    }
}
