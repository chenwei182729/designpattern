package com.cninfo.designpattern.creational.singleton;

/**
 * @author chenxinwei
 * @date 2019/9/7 14:04
 **/
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingletone lazySingletone = LazySingletone.getInstance();
//        LazyDoubleCheckSingletone lazyDoubleCheckSingletone = LazyDoubleCheckSingletone.getInstance();

        StaticInnerClassSingletone staticInnerClassSingletone = StaticInnerClassSingletone.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + staticInnerClassSingletone);
    }
}
