package com.alibaba_tencent.design_patterns.structural_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: FlyweightFactory
 * @Desc: 享元模式  享元工厂
 * @Author: Chen Yong
 * @Date: 2020-04-09 9:42
 */
public class FlyweightFactory {

    private Map<String, Flyweight> flyweights = new HashMap<>();

    private static FlyweightFactory factory = new FlyweightFactory();

    public static FlyweightFactory getInstance() {
        return factory;
    }

    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            ConcreteFlyweight flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
            return flyweight;
        }
    }
}
