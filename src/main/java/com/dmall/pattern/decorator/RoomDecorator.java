package com.dmall.pattern.decorator;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public abstract class RoomDecorator extends Room {
    //持有被装饰者的引用，这里是需要装修的房间
    private Room mRoom;

    public RoomDecorator(Room room) {
        mRoom = room;
    }

    @Override
    public void decorator() {
        mRoom.decorator();
    }

}
