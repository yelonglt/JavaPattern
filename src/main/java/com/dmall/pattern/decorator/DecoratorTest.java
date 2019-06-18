package com.dmall.pattern.decorator;

/**
 * 装饰者模式测试
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Room room = NewRoom.createRoom();
        RoomDecorator bedRoom = new BedRoom(room);
        bedRoom.decorator();
        RoomDecorator kitchenRoom = new KitchenRoom(room);
        kitchenRoom.decorator();
    }

}
