package com.dmall.pattern.chain;

/**
 * Created by yelong on 2018/8/23.
 * mail:354734713@qq.com
 */
public class ChainTest {

    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("叶龙", 1, "回家看看");

        DirectorHandler directorHandler = new DirectorHandler();
        ManagerHandler managerHandler = new ManagerHandler();
        BossHandler bossHandler = new BossHandler();

        directorHandler.setNextHandler(managerHandler);
        managerHandler.setNextHandler(bossHandler);

        directorHandler.handleRequest(request);

    }

}
