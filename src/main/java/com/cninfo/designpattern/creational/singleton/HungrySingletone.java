package com.cninfo.designpattern.creational.singleton;

import java.io.Serializable;

/**
 * @author chenxinwei
 * @date 2019/9/7 15:04
 * 一开始就new ,如果自始至终没有用到，会造成资源的浪费
 **/
public class HungrySingletone implements Serializable {
    /**
     * 方法1.静态类
     */
//    public final static HungrySingletone hungrySingletone = new HungrySingletone();
    public final static HungrySingletone hungrySingletone;

    /**方法2.静态代码块*/
    static {
        hungrySingletone = new HungrySingletone();
    }

    private HungrySingletone() {

    }


    public static HungrySingletone getInstance() {
        return hungrySingletone;
    }

    /**
     * Object类中没有readResolve方法
     **/
    private Object readResolve() {
        return hungrySingletone;
    }
}
