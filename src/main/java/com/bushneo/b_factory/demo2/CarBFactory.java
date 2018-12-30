package com.bushneo.b_factory.demo2;

/**
 * 简单工厂(静态工厂)
 * @author bushneo
 * @create 2018-12-30 11:38
 */
public class CarBFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new CarB();
    }
}
