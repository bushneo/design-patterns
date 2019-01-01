package com.bushneo.structural.g_bridge.demo2;

/**
 * @author bushneo
 * @create 2019-01-01 14:43
 */
public class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}
