package com.dmall.pattern.build.factory;

import com.dmall.pattern.build.Toy;

/**
 * 小人工厂类
 * Created by yelong on 2016/11/11.
 */
public abstract class ToyFactory {

    public abstract <T extends Toy> T createToy(Class<T> cls);

}
