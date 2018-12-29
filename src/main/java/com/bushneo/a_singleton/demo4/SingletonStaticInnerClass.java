package com.bushneo.a_singleton.demo4;

/**
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
