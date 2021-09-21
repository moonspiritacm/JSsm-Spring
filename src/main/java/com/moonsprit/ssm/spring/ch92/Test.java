package com.moonsprit.ssm.spring.ch92;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 被动创建对象
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ch92.xml");
        JuiceMaker juiceMaker = (JuiceMaker) ctx.getBean("juiceMaker");
        System.out.println(juiceMaker.makeJuice());
        ctx.close();
    }
}
