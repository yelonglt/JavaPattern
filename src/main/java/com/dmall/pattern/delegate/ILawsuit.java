package com.dmall.pattern.delegate;

/**
 * 律师诉讼接口
 * Created by yelong on 2016/12/19.
 */
public interface ILawsuit {

    /**
     * 提交申请
     */
    void submit();

    /**
     * 进行举证
     */
    void burden();

    /**
     * 开始辩护
     */
    void defend();

    /**
     * 诉讼完成
     */
    void finish();

}
