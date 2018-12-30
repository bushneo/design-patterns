package com.bushneo.a_singleton.demo6;

import java.io.ObjectInputStream;

/**
 * 测试反射破坏单例的情况
 *
 * @author bushneo
 * @create 2018-12-29 23:09
 */
public class SingletonTest {
    private static SingletonTest instance ;

    private SingletonTest(){
        /*------------------防止反射破坏单例情况--------------------*/
        if (instance != null){
            throw new RuntimeException("不能重复实例化该单例对象");
        }
        /*------------------防止反射破坏单例情况--------------------*/

    }

    public static synchronized SingletonTest getInstance() {
        if (instance == null){
            /**
             * 此处为了方便看出并发访问效果，睡眠50ms
             */
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingletonTest();
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("hello! my name is neo");
    }

}
