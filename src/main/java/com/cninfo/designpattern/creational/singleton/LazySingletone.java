package com.cninfo.designpattern.creational.singleton;

/**
 * @author chenxinwei
 * @date 2019/9/7 14:02
 **/
public class LazySingletone {
    private static LazySingletone lazySingletone;

    private LazySingletone() {

    }

    /**
     * 改进1
     */
    public synchronized static LazySingletone getInstance() {
        if (lazySingletone == null) {
            lazySingletone = new LazySingletone();
        }
        return lazySingletone;
    }
//    /**改进2*/
//    public  static LazySingletone getInstance() {
//        synchronized (LazySingletone.class){
//            if (lazySingletone == null) {
//                lazySingletone = new LazySingletone();
//            }
//        }
//        return lazySingletone;
//    }

//    public static LazySingletone getInstance() {
//        if (lazySingletone == null) {
//            lazySingletone = new LazySingletone();
//        }
//        return lazySingletone;
//    }

}
