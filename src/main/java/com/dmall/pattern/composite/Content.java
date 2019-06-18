package com.dmall.pattern.composite;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class Content extends PageElement {

    public Content(String name) {
        super(name);
    }

    public void addPageElement(PageElement pageElement) {
        throw new UnsupportedOperationException("不支持此操作");
    }

    public void removePageElement(PageElement pageElement) {
        throw new UnsupportedOperationException("不支持此操作");
    }

    public void clear() {
        throw new UnsupportedOperationException("不支持此操作");
    }

    public void print(String placeholder) {
        System.out.println(placeholder + "──" + getName());
    }
}
