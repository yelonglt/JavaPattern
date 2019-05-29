package com.dmall.pattern.factory.bmw;

import com.dmall.pattern.factory.EngineFactory;

/**
 * Created by yelong on 2019-05-29.
 * mail:354734713@qq.com
 */
public class BMWEngineFactory implements EngineFactory {

    public String createEngine() {
        System.out.println("宝马发动机工厂生产发动机");
        return "宝马发动机";
    }

}
