package com.bushneo.creational.a_singleton.demo2;

/**
 * 饿汉式
 * 该写法有懒加载效果，但是线程不安全
 * @author bushneo
 * @create 2018-12-29 23:09
 */
public class SingletonLazy1 {
    private static SingletonLazy1 instance ;

    private SingletonLazy1(){}

    public static SingletonLazy1 getInstance() {
        if (instance == null){
            /*--------------------------------------------*/
            /**
             * 此处为了方便看出并发访问效果，睡眠50ms
             */
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*--------------------------------------------*/
            instance = new SingletonLazy1();
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("hello! my name is neo");
    }
}
