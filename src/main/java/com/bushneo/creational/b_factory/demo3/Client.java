package com.bushneo.creational.b_factory.demo3;

/**
 * 抽象工厂测试
 * @author bushneo
 * @create 2018-12-30 16:06
 */
public class Client {

    public static void main(String[] args) {
        CarFactory carFactory = new CarTopFactory();
        Engine engine = carFactory.createEngine();
        engine.run();
    }
}
