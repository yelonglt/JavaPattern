package com.dmall.pattern.flyweight;

/**
 * 享元模式测试
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class FlyweightTest {

    public static void main(String[] args) {
        Bike ofo = BikeFactory.getInstance().getBike("ofo");
        ofo.bill(20);

        Bike mobike = BikeFactory.getInstance().getBike("mobike");
        mobike.bill(30);

        Bike otherOfo = BikeFactory.getInstance().getBike("ofo");
        otherOfo.bill(100);
    }

}
