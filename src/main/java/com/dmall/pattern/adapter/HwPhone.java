package com.dmall.pattern.adapter;

/**
 * 类适配模式，通过继承源目标来实现，无需持有源目标对象。
 * Created by yelong on 2019-05-30.
 * mail:354734713@qq.com
 */
public class HwPhone extends Phone {

    public void openMarket() {
        System.out.println("打开华为应用市场");
    }

}
