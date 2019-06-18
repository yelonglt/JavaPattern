package com.dmall.pattern.bridge.person;

import com.dmall.pattern.bridge.clothes.Clothes;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public abstract class Person {

    protected Clothes mClothes;

    public void setClothes(Clothes clothes) {
        mClothes = clothes;
    }

    public abstract void dress();

}
