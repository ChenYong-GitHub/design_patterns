package com.alibaba_tencent.design_patterns.structural_pattern.adapter;

/**
 * @ClassName: OpticalAdapter
 * @Desc: 适配器模式  光电发动机适配器
 * @Author: Chen Yong
 * @Date: 2020-04-07 14:56
 */
public class OpticalAdapter implements TargetMotor {

    private OpticalMotor opticalMotor;

    public OpticalAdapter() {
        opticalMotor = new OpticalMotor();
    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}
