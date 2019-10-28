package com.cninfo.designpattern.creational.singleton;

import java.io.*;

/**
 * @author chenxinwei
 * @date 2019/9/7 14:06
 **/
public class MainClient2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingletone hungrySingletone = HungrySingletone.getInstance();
        final String singleton_file = "singleton_file";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(singleton_file));
        oos.writeObject(hungrySingletone);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(singleton_file));
        HungrySingletone hungrySingletone2 = (HungrySingletone) ois.readObject();
        /**
         * 通过序列化和反序列化得到了不同的单例对你
         */
        System.out.println(hungrySingletone);
        System.out.println(hungrySingletone2);
        System.out.println(hungrySingletone == hungrySingletone2);
        System.out.println(hungrySingletone.equals(hungrySingletone2));
    }
}
