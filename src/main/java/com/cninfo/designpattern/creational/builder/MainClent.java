package com.cninfo.designpattern.creational.builder;

/**
 * @author chenxinwei
 * @date 2019/9/3 16:45
 **/
public class MainClent {
    public static void main(String[] args) {
        Coach coach = new Coach();
        CourseBuilder courseBuilder = new CourseActualBuilder();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("设计模式精讲", "设计模式精讲PPT", "设计模式精讲Video", "设计模式精讲Article", "设计模式精讲QA");
        System.out.println(course.toString());
    }
}
