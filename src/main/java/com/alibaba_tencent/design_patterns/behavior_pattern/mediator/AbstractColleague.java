package com.alibaba_tencent.design_patterns.behavior_pattern.mediator;

/**
 * @ClassName: AbstractColleague
 * @Desc: 中介者模式  抽象同事类
 * @Author: Chen Yong
 * @Date: 2020-04-08 15:50
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send();

    public abstract void receive();

}
