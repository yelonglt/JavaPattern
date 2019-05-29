package com.dmall.pattern.factory.bmw;

import com.dmall.pattern.factory.CarFactory;

/**
 * Created by yelong on 2019-05-29.
 * mail:354734713@qq.com
 */
public class BMWCarFactory implements CarFactory {

    public void installWheel() {
        BMWWheelFactory factory = new BMWWheelFactory();
        String wheel = factory.createWheel();
        System.out.println("安装轮胎：" + wheel);
    }

    public void installEngine() {
        BMWEngineFactory factory = new BMWEngineFactory();
        String engine = factory.createEngine();
        System.out.println("安装发动机：" + engine);
    }

    public void installDone() {
        System.out.println("宝马汽车安装完成");
    }

}
