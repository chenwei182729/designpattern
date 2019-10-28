package com.cninfo.designpattern.creational.factorymethod;

/**
 * @user Chen
 * @date 2019/9/1
 **/
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
