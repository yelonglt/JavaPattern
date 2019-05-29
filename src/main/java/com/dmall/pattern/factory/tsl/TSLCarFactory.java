package com.dmall.pattern.factory.tsl;

import com.dmall.pattern.factory.CarFactory;

/**
 * Created by yelong on 2019-05-29.
 * mail:354734713@qq.com
 */
public class TSLCarFactory implements CarFactory {

    public void installWheel() {
        TSLWheelFactory factory = new TSLWheelFactory();
        String wheel = factory.createWheel();
        System.out.println("安装轮胎：" + wheel);
    }

    public void installEngine() {
        TSLEngineFactory factory = new TSLEngineFactory();
        String engine = factory.createEngine();
        System.out.println("安装发动机：" + engine);
    }

    public void installDone() {
        System.out.println("特斯拉汽车安装完成");
    }

}
