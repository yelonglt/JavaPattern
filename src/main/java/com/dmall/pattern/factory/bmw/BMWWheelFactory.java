package com.dmall.pattern.factory.bmw;

import com.dmall.pattern.factory.WheelFactory;

/**
 * Created by yelong on 2019-05-29.
 * mail:354734713@qq.com
 */
public class BMWWheelFactory implements WheelFactory {

    public String createWheel() {
        System.out.println("宝马轮胎工厂生产轮胎");
        return "宝马轮胎";
    }

}
