package com.alibaba_tencent.design_patterns.structural_pattern.adapter;

/**
 * @ClassName: ElectricMonitor
 * @Desc: 适配器模式  适配者1：电能发动机
 * @Author: Chen Yong
 * @Date: 2020-04-07 14:50
 */
public class ElectricMotor {

    public void electricDrive() {
        System.out.println("电能发动机驱动汽车！");
    }
}
