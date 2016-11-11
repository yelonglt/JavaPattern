package com.dmall.pattern.build;

/**
 * Created by yelong on 2016/11/11.
 */
public class BuleToy extends Toy{
    String getColor() {
        return "bule";
    }

    void talk() {
        System.out.println("Hello BuleToy");
    }
}
