package com.cninfo.designpattern.creational.abstractfactory;

/**
 * @author chenxinwei
 * @date 2019/9/3 8:48
 **/
public abstract class CourseFactory {
    /**
     * @Description
     * @Return
     * @Author chenxinwei
     * @Since 2019/9/3
     **/
    public abstract Video getVideo();

    public abstract Article getArticle();
}
