package com.dmall.pattern.factory.tsl;

import com.dmall.pattern.factory.WheelFactory;

/**
 * Created by yelong on 2019-05-29.
 * mail:354734713@qq.com
 */
public class TSLWheelFactory implements WheelFactory {

    public String createWheel() {
        System.out.println("特斯拉轮胎工厂生产轮胎");
        return "特斯拉轮胎";
    }

}
