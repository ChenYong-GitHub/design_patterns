package com.alibaba_tencent.design_patterns.behavior_pattern.chain_of_responsibility;

/**
 * @ClassName: ConcreteHandler1
 * @Desc: 责任链模式 具体处理者1
 * @Author: Chen Yong
 * @Date: 2020-04-07 13:53
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("one".equals(request)) {
            System.out.println("具体处理者1 负责处理该请求");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没人处理该请求");
            }
        }
    }
}
