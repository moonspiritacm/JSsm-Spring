package com.moonsprit.ssm.spring.ch91;

/**
 * 搅拌器
 */
public class Blender {
    /**
     * 搅拌
     *
     * @param water 液体
     * @param fruit 水果
     * @param sugar 糖量
     * @return 果汁制成品
     */
    public String mix(String water, String fruit, String sugar) {
        String juice = "这是一杯由 [液体：" + water + "，水果：" + fruit + "，糖量：" + sugar + "] 制作的果汁。";
        return juice;
    }
}
