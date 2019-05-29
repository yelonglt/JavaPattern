package com.dmall.pattern.factory;

import com.dmall.pattern.factory.bmw.BMWCarFactory;
import com.dmall.pattern.factory.tsl.TSLCarFactory;

/**
 * 主要阐述抽象工厂模式和工厂模式
 * 不管什么品牌的汽车的需要轮胎和发动机，这样就可以使用抽象工厂模式，抽象出生产轮胎和发动机
 * 汽车的组成是轮胎和发动机，这样就是可以使用工厂模式，例如宝马工厂只安装宝马的轮胎和发动机
 * 工厂模式是解决一个产品多个层级方面的事情
 * 抽象工厂模式是解决多个产品多个层级方面的事情
 * Created by yelong on 2019-05-29.
 * mail:354734713@qq.com
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        CarFactory factory = new BMWCarFactory();
        //CarFactory factory = new TSLCarFactory();
        factory.installWheel();
        factory.installEngine();
    }

}
