package com.alibaba_tencent.design_patterns.behavior_pattern.chain_of_responsibility;

/**
 * @ClassName: ChainOfResponsibilityClient
 * @Desc: 责任链模式 客户端
 * @Author: Chen Yong
 * @Date: 2020-04-07 13:49
 */
public class ChainOfResponsibilityClient {

    public static void main(String[] args) {

        // 组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setNext(handler2);
        handler2.setNext(handler3);

        // 提交请求
        handler1.handleRequest("three");
    }

}
