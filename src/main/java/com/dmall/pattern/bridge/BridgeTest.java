package com.dmall.pattern.bridge;

import com.dmall.pattern.bridge.clothes.Clothes;
import com.dmall.pattern.bridge.clothes.Shirt;
import com.dmall.pattern.bridge.clothes.Uniform;
import com.dmall.pattern.bridge.person.Coder;
import com.dmall.pattern.bridge.person.Person;
import com.dmall.pattern.bridge.person.Student;

/**
 * 桥接模式测试
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class BridgeTest {

    public static void main(String[] args) {
        //创建各种衣服对象
        Clothes uniform = new Uniform();
        Clothes shirt = new Shirt();

        //不同职业的人穿衣服
        Person coder = new Coder();
        coder.setClothes(shirt);
        coder.dress();
        coder.setClothes(uniform);
        coder.dress();

        Person student = new Student();
        student.setClothes(uniform);
        student.dress();
        student.setClothes(shirt);
        student.dress();
    }

}
