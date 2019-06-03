package com.dmall.pattern.delegate;

import java.lang.reflect.Proxy;

/**
 * Created by yelong on 2016/12/19.
 */
public class DelegateTest {

    public static void main(String[] args) {

        //静态代理
        Plaintiff plaintiff = new Plaintiff();
        Lawsuit lawsuit = new Lawyer(plaintiff);
        lawsuit.submit();
        lawsuit.finish();

        System.out.println("-----------");

        //动态代理
        DynamicProxy proxy = new DynamicProxy(plaintiff);
        ClassLoader loader = plaintiff.getClass().getClassLoader();
        Lawsuit lawyer = (Lawsuit) Proxy.newProxyInstance(loader, new Class[]{Lawsuit.class}, proxy);

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();


    }


}
