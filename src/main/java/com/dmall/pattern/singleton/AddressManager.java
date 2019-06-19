package com.dmall.pattern.singleton;

/**
 * Created by yelong on 2019-06-19.
 * mail:354734713@qq.com
 */
public class AddressManager {

    private volatile static AddressManager instance;

    private AddressManager() {

    }

    public AddressManager getInstance() {
        if (instance == null) {
            synchronized (AddressManager.class) {
                if (instance == null) {
                    instance = new AddressManager();
                }
            }
        }
        return instance;
    }

}
