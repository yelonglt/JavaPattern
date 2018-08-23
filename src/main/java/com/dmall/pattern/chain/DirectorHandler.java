package com.dmall.pattern.chain;

/**
 * 直属领导
 * Created by yelong on 2018/8/23.
 * mail:354734713@qq.com
 */
public class DirectorHandler extends Handler {

    public void handleRequest(LeaveRequest request) {

        int days = request.getLeaveDays(); //获取请假天数
        String name = request.getName(); //获取请假人姓名
        String reason = request.getReason(); // 获取请假理由

        if (days <= 3) {
            System.out.println("员工" + name + "请假" + days + "天，理由：" + reason + "，直属领导审批通过");
        } else {
            if (this.nextHandler != null) { //否则，如果链上存在下一个Leader，就让他处理
                this.nextHandler.handleRequest(request);
            }
        }

    }
}
