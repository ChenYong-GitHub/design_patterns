package com.alibaba_tencent.design_patterns.behavior_pattern.mediator;

/**
 * @ClassName: AbstractMediator
 * @Desc: 终结者模式  抽象中介者
 * @Author: Chen Yong
 * @Date: 2020-04-08 15:52
 */
public abstract class AbstractMediator {

    // 注册同事
    public abstract void register(AbstractColleague abstractColleague);

    // 转发
    public abstract void replay(AbstractColleague abstractColleague);

}
