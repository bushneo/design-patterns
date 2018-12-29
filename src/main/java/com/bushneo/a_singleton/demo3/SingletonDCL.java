package com.bushneo.a_singleton.demo3;

/**
 * 双重校验锁方式
 * 该写法线程安全，也实现了懒加载效果，并发情况下能保持高性能，但是此种写法并非最优，因为被volatile标记的变量不会被编译器优化,
 * 如果不加volatile,则会并发隐患，因为new SingletonDCL()这步操作并非原子性操作，在JVM指令重排序的时，并发情况有可能会实例多个对象，破坏单例模式
 *
 * @author bushneo
 * @create 2018-12-29 23:43
 */
public class SingletonDCL {

    private volatile static SingletonDCL instance;
    private SingletonDCL(){}

    public static SingletonDCL getInstance() {

        if (instance == null){

            synchronized (SingletonDCL.class){
                if (instance == null){
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}
