package com.alibaba_tencent.design_patterns.structural_pattern.bridge;

/**
 * @ClassName: AbstractionImplA
 * @Desc: 桥接模式  扩展抽象化类A
 * @Author: Chen Yong
 * @Date: 2020-04-08 9:57
 */
public class AbstractionImplA extends Abstraction {

    protected AbstractionImplA(Implementor implementor) {
        super(implementor);
    }

    @Override
    protected void operation() {
        System.out.println("扩展抽象化A 角色被访问");
        implementor.operationImpl();
    }
}
