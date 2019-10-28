package com.cninfo.designpattern.creational.singleton;

/**
 * @author chenxinwei
 * @date 2019/9/7 14:02
 **/
public class StaticInnerClassSingletone {

    private static class InnerClass {
        private static StaticInnerClassSingletone staticInnerClassSingletone = new StaticInnerClassSingletone();
    }

    public static StaticInnerClassSingletone getInstance() {
        return InnerClass.staticInnerClassSingletone;
    }

    private StaticInnerClassSingletone() {

    }
}
