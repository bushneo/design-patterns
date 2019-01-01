package com.bushneo.creational.a_singleton.demo4;

/**
 * 静态内部类方式
 * 该写法线程安全，有懒加载效果，并发访问性能优良
 * @author bushneo
 * @create 2018-12-29 23:54
 */
public class SingletonStaticInnerClass {


    private SingletonStaticInnerClass() {
    }

    private static class SingletonHolder {
        public static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }

    public static final SingletonStaticInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
