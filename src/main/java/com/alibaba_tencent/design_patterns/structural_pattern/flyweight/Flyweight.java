package com.alibaba_tencent.design_patterns.structural_pattern.flyweight;

/**
 * @ClassName: Flyweight
 * @Desc: 享元模式  抽象享元角色
 * @Author: Chen Yong
 * @Date: 2020-04-09 9:18
 */
public interface Flyweight {

    void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight);
}
