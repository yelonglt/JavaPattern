package com.dmall.pattern.delegate;

import java.lang.reflect.Proxy;

/**
 * Created by yelong on 2016/12/19.
 */
public class DelegateTest {

    public static void main(String[] args) {

        //静态代理
        Plaintiff jack = new Plaintiff();
        ILawsuit lawsuit = new Lawyer(jack);
        lawsuit.submit();
        lawsuit.finish();

        System.out.println("-----------");

        //动态代理
        DynamicProxy proxy = new DynamicProxy(jack);
        ClassLoader loader = jack.getClass().getClassLoader();
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, proxy);

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();


    }


}
