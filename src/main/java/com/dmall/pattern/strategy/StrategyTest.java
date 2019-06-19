package com.dmall.pattern.strategy;

/**
 * 策略模式测试
 * Created by yelong on 2019-06-19.
 * mail:354734713@qq.com
 */
public class StrategyTest {

    public static void main(String[] args) {
        WashingMachine machine = new WashingMachine();
        machine.setWashingStrategy(WashingStrategyFactory.getInstance().getWashingStrategy(0));
        machine.washingClothes();
    }

}
