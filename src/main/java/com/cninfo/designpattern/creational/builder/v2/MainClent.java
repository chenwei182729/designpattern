package com.cninfo.designpattern.creational.builder.v2;

/**
 * @author chenxinwei
 * @date 2019/9/3 16:45
 **/
public class MainClent {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("设计模式精讲")
                .buildCoursePPT("设计模式精讲PPT")
                .buildCourseVideo("设计模式精讲Video")
                .buildCourseArticle("设计模式精讲Article")
                .buildCourseQA("设计模式精讲QA").makeCourse();
        System.out.println(course.toString());
    }
}
