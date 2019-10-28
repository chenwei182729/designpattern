package com.cninfo.designpattern.creational.abstractfactory;

/**
 * @author chenxinwei
 * @date 2019/9/3 8:48
 **/
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("生产Java手记");
    }
}
