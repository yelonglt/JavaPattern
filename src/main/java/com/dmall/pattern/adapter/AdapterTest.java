package com.dmall.pattern.adapter;

/**
 * Created by yelong on 2019-05-30.
 * mail:354734713@qq.com
 */
public class AdapterTest {

    public static void main(String[] args) {
        // 类适配模式
        HwPhone hwPhone = new HwPhone();
        hwPhone.callPhone();
        hwPhone.sendEmail();
        hwPhone.openMarket();

        //对象适配模式
        Phone phone = new Phone();
        MiPhone miPhone = new MiPhone();
        miPhone.setPhone(phone);
        miPhone.callPhone();
        miPhone.sendEmail();
        miPhone.openMarket();
    }

}
