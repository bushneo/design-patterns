package com.bushneo.c_builder.demo1;

/**
 * @author bushneo
 * @create 2018-12-31 0:18
 */
public class Pepsi extends Drink {

    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 6f;
    }
}
