package com.dmall.pattern.delegate;

/**
 * 律师
 * Created by yelong on 2016/12/19.
 */
public class Lawyer implements ILawsuit {

    //持有一具体被代理者的引用
    private ILawsuit mILawsuit;

    public Lawyer(ILawsuit mILawsuit) {
        this.mILawsuit = mILawsuit;
    }

    public void submit() {
        mILawsuit.submit();
    }

    public void burden() {
        mILawsuit.burden();
    }

    public void defend() {
        mILawsuit.defend();
    }

    public void finish() {
        mILawsuit.finish();
    }
}
