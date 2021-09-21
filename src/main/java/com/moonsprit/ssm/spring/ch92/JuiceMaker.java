package com.moonsprit.ssm.spring.ch92;

/**
 * 果汁生成器
 */
public class JuiceMaker {
    private String beverageShop;
    private Source source;

    public String getBeverageShop() {
        return beverageShop;
    }

    public void setBeverageShop(String beverageShop) {
        this.beverageShop = beverageShop;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String makeJuice() {
        String juice = "这是一杯由" + beverageShop + "饮品店提供的 [" + source.getFruit() + "，" +
                source.getSugar() + "，" + source.getSize() + "] 制作的果汁。";
        return juice;
    }
}
