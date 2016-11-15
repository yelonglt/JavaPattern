package com.dmall.pattern.prototype;

/**
 * Created by yelong on 2016/11/15.
 */
public class User implements Cloneable{

    public String name;
    public int age;
    public String phoneNum;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
