package com.cninfo.designpattern.creational.samplefactory;

/**
 * @user Chen
 * @date 2019/9/1
 **/
public class MainClient {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video javaVideo = videoFactory.getVideoByClassType(JavaVideo.class);
        javaVideo.produce();
        Video pythonVideo = videoFactory.getVideoByClassType(PythonVideo.class);
        pythonVideo.produce();
    }

//    public static void main(String[] args) {
//        CourseFactory videoFactory = new CourseFactory();
//        Video javaVideo = videoFactory.getVideo("java");
//        javaVideo.produce();
//        Video pythonVideo = videoFactory.getVideo("python");
//        pythonVideo.produce();
//    }
}
