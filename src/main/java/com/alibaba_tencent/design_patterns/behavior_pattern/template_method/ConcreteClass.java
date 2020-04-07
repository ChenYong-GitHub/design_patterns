package com.alibaba_tencent.design_patterns.behavior_pattern.template_method;

/**
 * @ClassName: ConcreteClass
 * @Desc: 模板模式 具体类
 * @Author: Chen Yong
 * @Date: 2020-04-07 10:58
 */
public class ConcreteClass extends AbstractClass {


    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1 的实现被调用。。。");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2 的实现被调用。。。");
    }
}
