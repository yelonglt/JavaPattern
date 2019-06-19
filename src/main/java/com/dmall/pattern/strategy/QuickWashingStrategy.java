package com.dmall.pattern.strategy;

/**
 * Created by yelong on 2019-06-19.
 * mail:354734713@qq.com
 */
public class QuickWashingStrategy implements WashingStrategy {

    public void washing() {
        System.out.println("快洗流程：");
        System.out.println("[洗涤] 1 次，每次 10 分钟");
        System.out.println("[漂洗] 1 次，每次 10 分钟");
        System.out.println("[脱水] 5 分钟");
        System.out.println("总共耗时：25 分钟");
    }

}
