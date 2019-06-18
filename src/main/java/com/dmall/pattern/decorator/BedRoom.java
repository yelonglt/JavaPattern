package com.dmall.pattern.decorator;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class BedRoom extends RoomDecorator {

    public BedRoom(Room room) {
        super(room);
    }

    @Override
    public void decorator() {
        super.decorator();
        addBedding();
    }

    private void addBedding() {
        System.out.println("装修成卧室：添加卧具");
    }

}
