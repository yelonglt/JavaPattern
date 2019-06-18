package com.dmall.pattern.bridge.person;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class Coder extends Person {

    public void dress() {
        System.out.println("程序员穿上" + mClothes.getName());
    }

}
