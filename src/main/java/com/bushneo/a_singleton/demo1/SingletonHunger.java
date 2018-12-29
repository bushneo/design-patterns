package com.bushneo.a_singleton.demo1;

/**
 * 饿汉式
 * 线程安全，但是不能实现延迟加载
 * @author bushneo
 * @create 2018-12-29 23:09
 */
public class SingletonHunger {
    private static SingletonHunger instance = new SingletonHunger();

    private SingletonHunger(){}

    public static SingletonHunger getInstance() {
        return instance;
    }

    public void sayHello(){
        System.out.println("hello! my name is neo");
    }
}
