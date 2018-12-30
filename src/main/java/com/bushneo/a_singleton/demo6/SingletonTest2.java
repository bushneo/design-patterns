package com.bushneo.a_singleton.demo6;

import java.io.Serializable;

/**
 * 测试反序列化破坏单例的情况
 *
 * @author bushneo
 * @create 2018-12-29 23:09
 */
public class SingletonTest2 implements Serializable {
    private static SingletonTest2 instance ;

    private SingletonTest2(){}

    public static synchronized SingletonTest2 getInstance() {
        if (instance == null){
            /**
             * 此处为了方便看出并发访问效果，睡眠50ms
             */
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingletonTest2();
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("hello! my name is neo");
    }

    /*------------------防止序列化破坏单例情况--------------------*/
    private Object readResolve() {
        return instance;
    }
    /*------------------防止序列化破坏单例情况--------------------*/
}
