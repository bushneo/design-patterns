package com.bushneo.creational.a_singleton.demo6;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author bushneo
 * @create 2018-12-30 10:23
 */
public class Test {

    public static void main(String[] args) {
        testReflex();
//        testSerializable();
    }

    /**
     * 测试反射破坏单例情况
     */
    public static void testReflex(){
        SingletonTest instance = SingletonTest.getInstance();
        try {
            Class<SingletonTest> aClass = (Class<SingletonTest>) Class.forName("com.bushneo.creational.a_singleton.demo6.SingletonTest");
            Constructor<SingletonTest> constructor = aClass.getDeclaredConstructor(null);
            constructor.setAccessible(true);//跳过检查权限
            SingletonTest singletonTest1 = constructor.newInstance();
            System.out.println(singletonTest1 == instance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试反序列化破坏单例模式
     */
    public static void testSerializable(){
        String path = Class.class.getClass().getResource("/").getPath();
        System.out.println(path);
        SingletonTest2 instance1 = SingletonTest2.getInstance();
        try {
            FileOutputStream fos = new FileOutputStream(path+"a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance1);
            oos.close();
            fos.close();

            ObjectInputStream ois  = new ObjectInputStream(new FileInputStream(path+"a.txt"));
            SingletonTest2 singletonTest2 = (SingletonTest2) ois.readObject();
            System.out.println(singletonTest2 == instance1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
