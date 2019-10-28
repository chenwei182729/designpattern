package com.cninfo.designpattern.creational.factorymethod;

/**
 * @user Chen
 * @date 2019/9/1
 **/
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("生产Java视频");
    }
}
