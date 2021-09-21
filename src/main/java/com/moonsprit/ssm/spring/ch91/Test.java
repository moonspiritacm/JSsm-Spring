package com.moonsprit.ssm.spring.ch91;

/**
 * 主动创建对象
 */
public class Test {
    public static void main(String[] args) {
        JuiceMaker juiceMaker = new JuiceMaker();
        juiceMaker.setWater("矿泉水");
        juiceMaker.setFruit("火龙果");
        juiceMaker.setSugar("少塘");
        System.out.println(juiceMaker.makeJuice());
    }
}
