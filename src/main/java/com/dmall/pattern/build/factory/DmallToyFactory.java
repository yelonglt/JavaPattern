package com.dmall.pattern.build.factory;

import com.dmall.pattern.build.Toy;

/**
 * Created by yelong on 2016/11/11.
 */
public class DmallToyFactory extends ToyFactory {

    public <T extends Toy> T createToy(Class<T> cls) {
        Toy toy = null;

        try {
            toy = (Toy) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) toy;
    }
}
