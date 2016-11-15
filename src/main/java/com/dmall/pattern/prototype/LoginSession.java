package com.dmall.pattern.prototype;

/**
 * Created by yelong on 2016/11/15.
 */
public class LoginSession {

    private User loginedUser;

    private LoginSession() {

    }

    private static class LoginSessionHolder {
        private static LoginSession instance = new LoginSession();
    }

    public static LoginSession getInstance() {
        return LoginSessionHolder.instance;
    }

    public User getLoginedUser() throws CloneNotSupportedException {
        return (User) loginedUser.clone();
    }

    public void setLoginedUser(User loginedUser) {
        this.loginedUser = loginedUser;
    }
}
