package com.cninfo.designpattern.creational.abstractfactory;

/**
 * @author chenxinwei
 * @date 2019/9/3 8:48
 **/
public class PythonCourseFactory extends CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }


    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
