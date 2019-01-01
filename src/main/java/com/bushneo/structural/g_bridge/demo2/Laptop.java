package com.bushneo.structural.g_bridge.demo2;

/**
 * @author bushneo
 * @create 2019-01-01 14:44
 */
public class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}
