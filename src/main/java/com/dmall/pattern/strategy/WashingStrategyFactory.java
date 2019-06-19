package com.dmall.pattern.strategy;

import com.dmall.pattern.flyweight.Bike;
import com.dmall.pattern.flyweight.BikeFactory;

import java.util.HashMap;

/**
 * Created by yelong on 2019-06-19.
 * mail:354734713@qq.com
 */
public class WashingStrategyFactory {

    private static class WashingStrategyFactoryHolder {
        private static WashingStrategyFactory instance = new WashingStrategyFactory();
    }

    private WashingStrategyFactory() {

    }

    public static WashingStrategyFactory getInstance() {
        return WashingStrategyFactoryHolder.instance;
    }

    public WashingStrategy getWashingStrategy(int type) {
        if (type == 1) {
            return new SoftWashingStrategy();
        } else if (type == 2) {
            return new QuickWashingStrategy();
        }
        return new StandardWashingStrategy();
    }

}
