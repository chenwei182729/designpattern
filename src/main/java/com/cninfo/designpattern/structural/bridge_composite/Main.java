package com.cninfo.designpattern.structural.bridge_composite;

public class Main {
    public static void main(String[] args) {
        CatelogComponent linuxCourse = new Course("linux课程", 10);
        CatelogComponent windowsCourse = new Course("windows课程", 20);

        CatelogComponent javaComponent = new CourseCatelog("Java课程", 2);
        CatelogComponent jdbcCourse = new Course("java jdbc课程", 55);
        CatelogComponent jsonCourse = new Course("java json课程", 66);
        CatelogComponent xmlCourse = new Course("java xml课程", 77);
        javaComponent.add(jdbcCourse);
        javaComponent.add(jsonCourse);
        javaComponent.add(xmlCourse);

        CatelogComponent imoocComponent = new CourseCatelog("慕课网课程主目录", 1);
        imoocComponent.add(linuxCourse);
        imoocComponent.add(windowsCourse);
        imoocComponent.add(javaComponent);
        imoocComponent.print();
    }
}
