package com.alibaba_tencent.design_patterns.structural_pattern.flyweight;

/**
 * @ClassName: UnsharedConcreteFlyweight
 * @Desc: 享元模式  非享元角色
 * @Author: Chen Yong
 * @Date: 2020-04-09 9:20
 */
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
