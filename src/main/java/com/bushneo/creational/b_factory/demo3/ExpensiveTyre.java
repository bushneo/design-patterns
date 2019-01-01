package com.bushneo.creational.b_factory.demo3;

/**
 * 昂贵的轮胎
 * @author bushneo
 * @create 2018-12-30 16:20
 */
public class ExpensiveTyre implements Tyre {


    @Override
    public void rolling() {
        System.out.println("贵的轮胎");
    }
}
