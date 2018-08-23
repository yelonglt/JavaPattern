package com.dmall.pattern.chain.okhttp;

/**
 * Created by yelong on 2018/8/23.
 * mail:354734713@qq.com
 */
public interface Interceptor {

    Response intercept(Chain chain);

    interface Chain {
        Request request();

        Response proceed(Request request);
    }

}
