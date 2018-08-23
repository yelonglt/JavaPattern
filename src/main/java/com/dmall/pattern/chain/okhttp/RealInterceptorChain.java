package com.dmall.pattern.chain.okhttp;

import java.util.List;

/**
 * Created by yelong on 2018/8/23.
 * mail:354734713@qq.com
 */
public class RealInterceptorChain implements Interceptor.Chain {

    private List<Interceptor> interceptors;
    private int index;

    public RealInterceptorChain(List<Interceptor> interceptors, int index) {
        this.interceptors = interceptors;
        this.index = index;
    }

    public Request request() {
        return null;
    }

    public Response proceed(Request request) {

        if (index >= interceptors.size()) {
            System.out.println("怎么就没有人处理我的请求......");
            return new Response();
        }

        RealInterceptorChain next = new RealInterceptorChain(interceptors, index + 1);
        Interceptor interceptor = interceptors.get(index);

        return interceptor.intercept(next);
    }
}
