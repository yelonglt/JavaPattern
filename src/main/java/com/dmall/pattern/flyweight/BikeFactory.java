package com.dmall.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class BikeFactory {

    private Map<String, Bike> bikePool;

    private static class BikeFactoryHolder {
        private static BikeFactory instance = new BikeFactory();
    }

    private BikeFactory() {
        bikePool = new HashMap<String, Bike>();
    }

    public static BikeFactory getInstance() {
        return BikeFactoryHolder.instance;
    }

    public Bike getBike(String name) {
        Bike bike;
        if (bikePool.containsKey(name)) {
            System.out.println("押金已交，直接用车：" + name);
            bike = bikePool.get(name);
        } else {
            bike = new ShareBike();
            bikePool.put(name, bike);
            System.out.println(name + "交100押金，可以用车了。");
        }
        return bike;
    }

}
