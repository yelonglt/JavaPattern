package com.dmall.pattern.strategy;

/**
 * Created by yelong on 2019-06-19.
 * mail:354734713@qq.com
 */
public class StandardWashingStrategy implements WashingStrategy {

    public void washing() {
        System.out.println("标准流程：");
        System.out.println("[浸泡] 10 分钟");
        System.out.println("[洗涤] 2 次，每次 15 分钟");
        System.out.println("[漂洗] 1 次，每次 10 分钟");
        System.out.println("[脱水] 5 分钟");
        System.out.println("总共耗时：55 分钟");
    }

}
