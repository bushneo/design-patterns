package com.bushneo.creational.b_factory.demo2;

/**
 * 测试
 *
 * @author bushneo
 * @create 2018-12-30 12:48
 */
public class Client {

    public static void main(String[] args) {
        CarFactory carAFactory = new CarAFactory();
        CarFactory carBFactory = new CarBFactory();
        Car car1 = carAFactory.createCar();
        Car car2 = carBFactory.createCar();

        car1.run();
        car2.run();
    }


}
