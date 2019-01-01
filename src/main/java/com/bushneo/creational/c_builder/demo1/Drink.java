package com.bushneo.creational.c_builder.demo1;

/**
 * @author bushneo
 * @create 2018-12-31 0:14
 */
public abstract class Drink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
