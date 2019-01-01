package com.bushneo.structural.g_bridge.demo2;

/**
 * 电脑
 * @author bushneo
 * @create 2019-01-01 13:19
 */
public class Computer {

    Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    /**
     * 销售
     */
    public void sale() {
        brand.sale();
    }

}
