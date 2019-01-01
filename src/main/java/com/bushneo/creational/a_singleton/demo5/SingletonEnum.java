package com.bushneo.creational.a_singleton.demo5;

/**
 * 枚举方式
 * 简单高效，线程安全，但是非懒加载
 * @author bushneo
 * @create 2018-12-30 0:10
 */
public enum  SingletonEnum {

    INSTANCE;

    public void sayHello(){
        System.out.println("hello! my name is neo");
    }

}
