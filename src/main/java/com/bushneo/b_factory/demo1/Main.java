package com.bushneo.b_factory.demo1;

/**
 * @author bushneo
 * @create 2018-12-30 12:48
 */
public class Main {

    public static void main(String[] args) {
//          test1();
          test2();
    }

    public static void test1(){
        Car a = SimpleFactory1.createCar("A");
        Car b = SimpleFactory1.createCar("B");

        a.run();
        b.run();
    }

    public static void test2(){
        Car a = SimpleFactory2.createCarA();
        Car b = SimpleFactory2.createCarB();

        a.run();
        b.run();
    }
}
