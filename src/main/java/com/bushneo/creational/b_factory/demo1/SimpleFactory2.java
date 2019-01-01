package com.bushneo.creational.b_factory.demo1;

/**
 * 简单工厂(静态工厂)
 * @author bushneo
 * @create 2018-12-30 11:38
 */
public class SimpleFactory2 {

    public static Car createCarA(){
        return new CarA();
    }
    public static Car createCarB(){
        return new CarB();
    }

}
