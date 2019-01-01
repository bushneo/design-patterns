package com.bushneo.creational.c_builder.demo1;

/**
 * @author bushneo
 * @create 2018-12-31 0:17
 */
public class OrleanBurger extends Burger {

    @Override
    public String name() {
        return "奥尔良汉堡";
    }

    @Override
    public float price() {
        return 26f;
    }
}
