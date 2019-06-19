package com.dmall.pattern.singleton;

/**
 * Created by yelong on 2019-06-19.
 * mail:354734713@qq.com
 */
public class UserManager {

    //静态内部类只有在加载内部类的时候才初始化
    private static class UserManagerHolder {
        private static UserManager instance = new UserManager();
    }

    private UserManager() {

    }

    public static UserManager getInstance() {
        return UserManagerHolder.instance;
    }

}
