package com.dmall.pattern.delegate;

/**
 * 原告
 * Created by yelong on 2016/12/19.
 */
public class Plaintiff implements ILawsuit {

    public void submit() {
        System.out.println("提交诉讼申请");
    }

    public void burden() {
        System.out.println("这是我们签订的合同");
    }

    public void defend() {
        System.out.println("证据确凿,你还有什么可说的");
    }

    public void finish() {
        System.out.println("诉讼成功,老板结算工资");
    }
}
