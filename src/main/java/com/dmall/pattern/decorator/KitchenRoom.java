package com.dmall.pattern.decorator;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class KitchenRoom extends RoomDecorator {

    public KitchenRoom(Room room) {
        super(room);
    }

    @Override
    public void decorator() {
        super.decorator();
        addKitchenWare();
    }

    private void addKitchenWare() {
        System.out.println("装修成厨房：添加厨具");
    }

}
