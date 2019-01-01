package com.bushneo.creational.c_builder.demo1;

/**
 * @author bushneo
 * @create 2018-12-31 0:15
 */
public class FriedChickBurger extends Burger {

    @Override
    public String name() {
        return "炸鸡汉堡";
    }

    @Override
    public float price() {
        return 25f;
    }
}
