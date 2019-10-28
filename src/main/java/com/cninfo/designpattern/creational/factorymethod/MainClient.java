package com.cninfo.designpattern.creational.factorymethod;

/**
 * @user Chen
 * @date 2019/9/1
 **/
public class MainClient {
    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        Video javaVideo = javaVideoFactory.getVideo();
        javaVideo.produce();
        VideoFactory pythonVideoFactory = new PythonVideoFactory();

        Video pythonVideo = pythonVideoFactory.getVideo();
        pythonVideo.produce();
    }
}
