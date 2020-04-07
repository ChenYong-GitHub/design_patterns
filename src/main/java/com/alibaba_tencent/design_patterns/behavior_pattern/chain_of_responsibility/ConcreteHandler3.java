package com.alibaba_tencent.design_patterns.behavior_pattern.chain_of_responsibility;

/**
 * @ClassName: ConcreteHandler3
 * @Desc: 责任链模式 具体处理者3
 * @Author: Chen Yong
 * @Date: 2020-04-07 14:06
 */
public class ConcreteHandler3 extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("three".equals(request)) {
            System.out.println("具体处理者3 负责处理该处请求");
        } else {
            if (getNext() !=null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("无人处理该处请求");
            }
        }
    }
}
