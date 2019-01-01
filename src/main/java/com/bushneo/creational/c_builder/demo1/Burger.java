package com.bushneo.creational.c_builder.demo1;

/**
 * 汉堡类商品
 * @author bushneo
 * @create 2018-12-31 0:03
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
