package com.bushneo.creational.b_factory.demo1;

/**
 * 简单工厂(静态工厂)
 * @author bushneo
 * @create 2018-12-30 11:38
 */
public class SimpleFactory1 {

    public static Car createCar(String type){
        if ("A".equals(type)){
            return new CarA();
        }else if("B".equals(type)){
            return new CarB();
        }else{
            return null;
        }
    }

}
