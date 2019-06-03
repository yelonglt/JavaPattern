package com.dmall.pattern.delegate;

/**
 * 律师
 * Created by yelong on 2016/12/19.
 */
public class Lawyer implements Lawsuit {

    //持有一具体被代理者的引用
    private Lawsuit mLawsuit;

    public Lawyer(Lawsuit lawsuit) {
        mLawsuit = lawsuit;
    }

    public void submit() {
        mLawsuit.submit();
    }

    public void burden() {
        mLawsuit.burden();
    }

    public void defend() {
        mLawsuit.defend();
    }

    public void finish() {
        mLawsuit.finish();
    }
}
