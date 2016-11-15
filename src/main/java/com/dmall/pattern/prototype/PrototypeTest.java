package com.dmall.pattern.prototype;

/**
 * Created by yelong on 2016/11/15.
 */
public class PrototypeTest {

    public static void main(String[] args) {

        User user = new User();
        user.name = "long.ye";
        user.age = 18;
        user.address = new Address("北京市", "海淀区", "清华同方科技大厦");


        LoginSession.getInstance().setLoginedUser(user);

        User newUser = null;
        try {
            newUser = LoginSession.getInstance().getLoginedUser();
            newUser.address = new Address("北京市", "昌平区", "回龙观");
            System.out.println("user==" + user.toString());
            System.out.println("newUser==" + newUser.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
