package com.dmall.pattern.decorator;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class NewRoom extends Room {

    private NewRoom() {

    }

    public static NewRoom createRoom() {
        return new NewRoom();
    }

    public void decorator() {
        System.out.println("这是一间新房：装上电");
    }

}
