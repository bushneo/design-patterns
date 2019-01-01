package com.bushneo.structural.g_bridge.demo1;

/**
 * 台式机
 * @author bushneo
 * @create 2019-01-01 13:21
 */
public class Desktop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}
