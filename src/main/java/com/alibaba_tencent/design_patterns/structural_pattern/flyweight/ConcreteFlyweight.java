package com.alibaba_tencent.design_patterns.structural_pattern.flyweight;

/**
 * @ClassName: ConcreteFlyweight
 * @Desc: 享元模式  具体享元角色
 * @Author: Chen Yong
 * @Date: 2020-04-09 9:21
 */
public class ConcreteFlyweight implements Flyweight {

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight) {
        System.out.println("具体享元" + key + "被调用！");
        System.out.println("非享元角色的信息是：" + unsharedConcreteFlyweight.getInfo());
    }
}
