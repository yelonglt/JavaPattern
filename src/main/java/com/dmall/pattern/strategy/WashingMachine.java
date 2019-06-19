package com.dmall.pattern.strategy;

/**
 * Created by yelong on 2019-06-19.
 * mail:354734713@qq.com
 */
public class WashingMachine {

    private WashingStrategy mWashingStrategy;

    public void setWashingStrategy(WashingStrategy washingStrategy) {
        mWashingStrategy = washingStrategy;
    }

    public void washingClothes() {
        mWashingStrategy.washing();
    }

}
