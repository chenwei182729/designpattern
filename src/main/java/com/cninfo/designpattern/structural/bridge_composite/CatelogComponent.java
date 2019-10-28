package com.cninfo.designpattern.structural.bridge_composite;

public abstract class CatelogComponent {

    public void add(CatelogComponent catelogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatelogComponent catelogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName() {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
