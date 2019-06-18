package com.dmall.pattern.composite;

/**
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class Column extends PageElement {

    public Column(String name) {
        super(name);
    }

    public void addPageElement(PageElement pageElement) {
        pageElements.add(pageElement);
    }

    public void removePageElement(PageElement pageElement) {
        pageElements.remove(pageElement);
    }

    public void clear() {
        pageElements.clear();
    }

    public void print(String placeholder) {
        System.out.println(placeholder + "└──" + getName());
        for (PageElement pageElement : pageElements) {
            pageElement.print(placeholder + "   ");
        }
    }
}
