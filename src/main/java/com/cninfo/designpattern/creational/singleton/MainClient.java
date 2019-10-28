package com.cninfo.designpattern.creational.singleton;

/**
 * @author chenxinwei
 * @date 2019/9/7 14:06
 **/
public class MainClient {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("MainThread end");
    }
}
