package com.dmall.pattern.factory;

/**
 * Created by yelong on 2019-05-29.
 * mail:354734713@qq.com
 */
public interface CarFactory {

    /**
     * 安装汽车轮子
     */
    void installWheel();

    /**
     * 安装汽车发动机
     */
    void installEngine();

    /**
     * 汽车安装完成
     */
    void installDone();

}
