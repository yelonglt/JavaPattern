package com.dmall.pattern.factory.tsl;

import com.dmall.pattern.factory.EngineFactory;

/**
 * Created by yelong on 2019-05-29.
 * mail:354734713@qq.com
 */
public class TSLEngineFactory implements EngineFactory {

    public String createEngine() {
        System.out.println("特斯拉发动机工厂生产发动机");
        return "特斯拉发动机";
    }

}
