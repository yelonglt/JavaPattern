package com.dmall.pattern.adapter;

/**
 * 对象适配模式，通过持有源目标来实现，无需继承
 * Created by yelong on 2019-05-30.
 * mail:354734713@qq.com
 */
public class MiPhone {

    private Phone mPhone;

    public void setPhone(Phone phone) {
        mPhone = phone;
    }

    public void callPhone() {
        mPhone.callPhone();
    }

    public void sendEmail() {
        mPhone.sendEmail();
    }

    public void openMarket() {
        System.out.println("打开小米应用市场");
    }

}
