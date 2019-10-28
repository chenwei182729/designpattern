package com.cninfo.designpattern.creational.abstractfactory;

/**
 * @author chenxinwei
 * @date 2019/9/3 8:48
 **/
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("生产Python视频");
    }
}
