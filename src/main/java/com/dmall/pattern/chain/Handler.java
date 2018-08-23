package com.dmall.pattern.chain;

/**
 * 抽象的处理者，最终由具体的处理者处理业务逻辑。
 * Created by yelong on 2018/8/23.
 * mail:354734713@qq.com
 */
public abstract class Handler {

    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(LeaveRequest request);


}
