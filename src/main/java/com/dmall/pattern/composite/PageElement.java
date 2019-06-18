package com.dmall.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public abstract class PageElement {

    protected List<PageElement> pageElements = new ArrayList<PageElement>();
    private String name;

    public PageElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void addPageElement(PageElement pageElement);

    public abstract void removePageElement(PageElement pageElement);

    public abstract void clear();

    public abstract void print(String placeholder);

}
