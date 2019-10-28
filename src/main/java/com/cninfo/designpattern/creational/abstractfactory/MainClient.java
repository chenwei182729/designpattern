package com.cninfo.designpattern.creational.abstractfactory;

/**
 * @author chenxinwei
 * @date 2019/9/3 8:48
 **/
public class MainClient {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        video.produce();
        Article article = courseFactory.getArticle();
        article.produce();

        courseFactory = new PythonCourseFactory();
        video = courseFactory.getVideo();
        video.produce();
        article = courseFactory.getArticle();
        article.produce();

    }
}
