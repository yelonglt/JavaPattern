package com.dmall.pattern.build;

/**
 * Created by yelong on 2016/11/11.
 */
public class RedToy extends Toy{
    String getColor() {
        return "red";
    }

    void talk() {
        System.out.println("Hello RedToy");
    }
}
