package com.dmall.pattern.build;

import com.dmall.pattern.build.factory.DmallToyFactory;
import com.dmall.pattern.build.factory.ToyFactory;

/**
 * Created by yelong on 2016/11/11.
 */
public class Test {

    public static void main(String[] args) {

        ToyFactory factory = new DmallToyFactory();

        Toy blueToy = factory.createToy(BuleToy.class);
        System.out.println(blueToy.getColor());
        blueToy.talk();

        Toy blackToy = factory.createToy(BlackToy.class);
        System.out.println(blackToy.getColor());
        blackToy.talk();


    }

}
