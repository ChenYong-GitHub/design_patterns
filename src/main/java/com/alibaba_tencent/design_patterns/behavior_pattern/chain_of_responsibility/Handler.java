package com.alibaba_tencent.design_patterns.behavior_pattern.chain_of_responsibility;

/**
 * @ClassName: Handler
 * @Desc: 责任链模式 抽象处理类
 * @Author: Chen Yong
 * @Date: 2020-04-07 13:50
 */
public abstract class Handler {

    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
