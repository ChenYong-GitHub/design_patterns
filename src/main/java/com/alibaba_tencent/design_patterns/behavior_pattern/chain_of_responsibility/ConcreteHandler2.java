package com.alibaba_tencent.design_patterns.behavior_pattern.chain_of_responsibility;

/**
 * @ClassName: ConcreteHandler2
 * @Desc: 责任链模式 具体处理者2
 * @Author: Chen Yong
 * @Date: 2020-04-07 14:04
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("two".equals(request)) {
            System.out.println("具体处理者2 负责处理该处请求");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("无人处理该处请求");
            }
        }

    }
}
