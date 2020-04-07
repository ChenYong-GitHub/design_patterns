package com.alibaba_tencent.design_patterns.behavior_pattern.template_method;

/**
 * @ClassName: AbstractClass
 * @Desc: 模板模式 抽象类
 * @Author: Chen Yong
 * @Date: 2020-04-07 10:53
 */
public abstract class AbstractClass {

    // 模板方法
    public void templateMethod() {
        specificMethod();
        abstractMethod1();
        abstractMethod2();
        hookMethod1();
        hookMethod2();
    }

    public void specificMethod() {
        System.out.println("抽象类中的具体方法");
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();

    // 正确使用“钩子方法”可以使得子类控制父类的行为
    // 可以通过在具体子类中重写钩子方法 hookMethod1() 和 hookMethod2() 来改变抽象父类中的运行结果
    public void hookMethod1() {
        System.out.println("抽象类中的钩子方法1，非必要项");
    }

    public void hookMethod2() {

    }
}
