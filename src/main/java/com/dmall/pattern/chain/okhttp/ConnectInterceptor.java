package com.dmall.pattern.chain.okhttp;

import java.util.Random;

/**
 * Created by yelong on 2018/8/23.
 * mail:354734713@qq.com
 */
public class ConnectInterceptor implements Interceptor {

    public Response intercept(Chain chain) {
        System.out.println("ConnectInterceptor....");
        if (new Random().nextInt(3) == 2) {
            System.out.println("连接拦截器已经处理了");
            return new Response();
        }

        return chain.proceed(chain.request());
    }

}
