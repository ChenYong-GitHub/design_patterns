package com.alibaba_tencent.design_patterns.structural_pattern.bridge;

/**
 * @ClassName: Abstraction
 * @Desc: 桥接模式  抽象化角色
 * @Author: Chen Yong
 * @Date: 2020-04-08 9:56
 */
public abstract class Abstraction {

    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    protected abstract void operation();

}
