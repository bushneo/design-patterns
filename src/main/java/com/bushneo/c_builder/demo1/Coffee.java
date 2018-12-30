package com.bushneo.c_builder.demo1;

/**
 * @author bushneo
 * @create 2018-12-31 0:19
 */
public class Coffee extends Drink {

    @Override
    public String name() {
        return "咖啡";
    }

    @Override
    public float price() {
        return 10;
    }
}
