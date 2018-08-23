package com.dmall.pattern.chain.okhttp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yelong on 2018/8/23.
 * mail:354734713@qq.com
 */
public class OkHttpTest {

    public static void main(String[] args) {
        Response response = getResponseWithInterceptorChain();
    }

    private static Response getResponseWithInterceptorChain() {
        List<Interceptor> interceptors = new ArrayList<Interceptor>();
        interceptors.add(new LoggerInterceptor());
        interceptors.add(new BridgeInterceptor());
        interceptors.add(new CacheInterceptor());
        interceptors.add(new ConnectInterceptor());
        interceptors.add(new CallServerInterceptor());

        Interceptor.Chain chain = new RealInterceptorChain(interceptors, 0);
        return chain.proceed(new Request());
    }

}
