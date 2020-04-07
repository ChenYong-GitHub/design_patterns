package com.alibaba_tencent.design_patterns.structural_pattern.adapter;

/**
 * @ClassName: ElectricAdapter
 * @Desc: 适配器模式  电动发动机适配器
 * @Author: Chen Yong
 * @Date: 2020-04-07 14:55
 */
public class ElectricAdapter implements TargetMotor {

    private ElectricMotor electricMotor;

    public ElectricAdapter() {
        electricMotor = new ElectricMotor();
    }

    @Override
    public void drive() {
        electricMotor.electricDrive();
    }
}
