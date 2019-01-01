package com.bushneo.creational.a_singleton.demo2;

/**
 * 饿汉式
 * 该写法线程安全，有懒加载效果，但是并发访问时效率非常低
 * @author bushneo
 * @create 2018-12-29 23:09
 */
public class SingletonLazy2 {
    private static SingletonLazy2 instance ;

    private SingletonLazy2(){}

    public static synchronized SingletonLazy2 getInstance() {
        if (instance == null){
            /**
             * 此处为了方便看出并发访问效果，睡眠50ms
             */
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingletonLazy2();
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("hello! my name is neo");
    }
}
