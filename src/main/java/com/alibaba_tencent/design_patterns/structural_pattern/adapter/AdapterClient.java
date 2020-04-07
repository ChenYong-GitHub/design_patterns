package com.alibaba_tencent.design_patterns.structural_pattern.adapter;

/**
 * @ClassName: AdapterClient
 * @Desc: 适配器模式 客户端
 * @Author: Chen Yong
 * @Date: 2020-04-07 14:45
 */
public class AdapterClient {
    public static void main(String[] args) {
        TargetMotor targetMotor = new ElectricAdapter();
        targetMotor.drive();
    }
}
