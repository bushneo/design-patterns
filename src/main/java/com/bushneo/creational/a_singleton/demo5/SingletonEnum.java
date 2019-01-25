package com.bushneo.creational.a_singleton.demo5;

/**
 * 枚举方式
 * 简单高效，线程安全，但是非懒加载
 * @author bushneo
 * @create 2018-12-30 0:10
 */
public class SingletonEnum {

    private SingletonEnum(){

    }

    private enum Singleton{
        INSTANCE;
        private final SingletonEnum instance;

        Singleton() {
            instance = new SingletonEnum();
        }

        public SingletonEnum getInstance() {
            return instance;
        }
    }

    public static SingletonEnum getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

}
