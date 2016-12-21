package com.dmall.pattern.delegate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * Created by yelong on 2016/12/19.
 */
public class DynamicProxy implements InvocationHandler {

    //被代理的类的引用
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }
}
