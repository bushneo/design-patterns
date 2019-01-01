package com.bushneo.creational.b_factory.demo3;

/**
 * 引擎昂贵
 * @author bushneo
 * @create 2018-12-30 16:20
 */
public class ExpensiveEngine implements Engine {

    @Override
    public void run() {
        System.out.println("贵的发动机,动力就是足");
    }
}
