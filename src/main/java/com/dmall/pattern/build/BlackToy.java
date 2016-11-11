package com.dmall.pattern.build;

/**
 * Created by yelong on 2016/11/11.
 */
public class BlackToy extends Toy{
    String getColor() {
        return "black";
    }

    void talk() {
        System.out.println("Hello BlackToy");
    }
}
