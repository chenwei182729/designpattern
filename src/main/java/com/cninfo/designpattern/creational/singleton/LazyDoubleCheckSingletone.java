package com.cninfo.designpattern.creational.singleton;

/**
 * @author chenxinwei
 * @date 2019/9/7 14:02
 **/
public class LazyDoubleCheckSingletone {
    /*使用volatile 防止重排序*/
    private volatile static LazyDoubleCheckSingletone lazyDoubleCheckSingletone;

    private LazyDoubleCheckSingletone() {

    }

    /**
     * 双重检查
     * 隐患：指令重排序
     */
    public synchronized static LazyDoubleCheckSingletone getInstance() {
        if (lazyDoubleCheckSingletone == null) {
            synchronized (LazyDoubleCheckSingletone.class) {
                if (lazyDoubleCheckSingletone == null) {
                    lazyDoubleCheckSingletone = new LazyDoubleCheckSingletone();
                    //1. 分配内存给对象
                    //2. 初始化对象
                    //3.设置lazyDoubleCheckSingletone 指向刚才分配的内存地址

                    //指令重排序 1、3、2，会出现
                    //intra-thread sematics

                }
            }
        }
        return lazyDoubleCheckSingletone;
    }

}
