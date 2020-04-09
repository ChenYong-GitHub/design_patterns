package com.alibaba_tencent.design_patterns.structural_pattern.flyweight;

/**
 * @ClassName: FlyweightClient
 * @Desc: 享元模式  客户端
 * @Author: Chen Yong
 * @Date: 2020-04-09 9:50
 */
public class FlyweightClient {

    public static void main(String[] args) {
        FlyweightFactory factory = FlyweightFactory.getInstance();
        Flyweight a1 = factory.getFlyweight("a");
        Flyweight a2 = factory.getFlyweight("a");
        Flyweight a3 = factory.getFlyweight("a");
        Flyweight b1 = factory.getFlyweight("b");
        Flyweight b2 = factory.getFlyweight("b");

        a1.operation(new UnsharedConcreteFlyweight("具体享元 a 第一次被调用"));
        a2.operation(new UnsharedConcreteFlyweight("具体享元 a 第二次被调用"));
        a3.operation(new UnsharedConcreteFlyweight("具体享元 a 第三次被调用"));
        b1.operation(new UnsharedConcreteFlyweight("具体享元 b 第一次被调用"));
        b2.operation(new UnsharedConcreteFlyweight("具体享元 b 第二次被调用"));

    }

}
