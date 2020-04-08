package com.alibaba_tencent.design_patterns.behavior_pattern.mediator;

/**
 * @ClassName: ConcreteColleagueB
 * @Desc: 中介者模式  具体同事类B
 * @Author: Chen Yong
 * @Date: 2020-04-08 16:06
 */
public class ConcreteColleagueB extends AbstractColleague {

    @Override
    public void send() {
        System.out.println("具体同事类B 发送了消息");
        mediator.replay(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类B 接收了消息");
    }
}
