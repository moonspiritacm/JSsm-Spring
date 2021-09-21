package com.moonsprit.ssm.spring.ch91;

/**
 * 果汁生成器
 */
public class JuiceMaker {
    private Blender blender;  // 搅拌器
    private String water;  // 液体
    private String fruit;  // 水果
    private String sugar;  // 糖量

    public Blender getBlender() {
        return blender;
    }

    public void setBlender(Blender blender) {
        this.blender = blender;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    /**
     * 制作果汁
     *
     * @return 果汁制成品
     */
    public String makeJuice() {
        blender = new Blender();
        return blender.mix(water, fruit, sugar);
    }
}
