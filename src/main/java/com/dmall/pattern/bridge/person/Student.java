package com.dmall.pattern.bridge.person;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class Student extends Person {

    public void dress() {
        System.out.println("学生穿上" + mClothes.getName());
    }

}
