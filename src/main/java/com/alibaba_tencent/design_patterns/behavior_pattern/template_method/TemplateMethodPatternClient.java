package com.alibaba_tencent.design_patterns.behavior_pattern.template_method;

/**
 * @ClassName: TemplateMethodPatternClient
 * @Desc: 模板模式 客户端
 * @Author: Chen Yong
 * @Date: 2020-04-07 10:59
 */
public class TemplateMethodPatternClient {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }

}
