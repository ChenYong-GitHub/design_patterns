package com.alibaba_tencent.design_patterns.behavior_pattern.mediator;

/**
 * @ClassName: ConcreteColleagueA
 * @Desc: 中介者模式 具体同事类A
 * @Author: Chen Yong
 * @Date: 2020-04-08 16:01
 */
public class ConcreteColleagueA extends AbstractColleague
{
    @Override
    public void send() {
        System.out.println("具体同事类A 发送了消息");
        mediator.replay(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类A 接收了消息");
    }
}
