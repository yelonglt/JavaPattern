package com.dmall.pattern.flyweight;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class ShareBike implements Bike {

    public void bill(int time) {
        int price = 1;
        int total = price * time;
        System.out.println("骑车花费了" + total + "元");
    }

}
