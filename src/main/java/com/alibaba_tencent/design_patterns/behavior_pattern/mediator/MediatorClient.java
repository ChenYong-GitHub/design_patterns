package com.alibaba_tencent.design_patterns.behavior_pattern.mediator;

/**
 * @ClassName: MediatorClient
 * @Desc: 中介者模式  客户端
 * @Author: Chen Yong
 * @Date: 2020-04-08 16:04
 */
public class MediatorClient {

    public static void main(String[] args) {

        AbstractColleague colleagueA = new ConcreteColleagueA();
        AbstractColleague colleagueB = new ConcreteColleagueB();
        AbstractMediator mediator = new ConcreteMediator();
        mediator.register(colleagueA);
        mediator.register(colleagueB);
        colleagueA.send();
        System.out.println("----------优雅的分割线----------");
        colleagueB.send();
    }
}
