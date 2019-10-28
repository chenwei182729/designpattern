package com.cninfo.designpattern.creational.factorymethod;

/**
 * @user Chen
 * @date 2019/9/1
 **/
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("生产FE视频");
    }
}
