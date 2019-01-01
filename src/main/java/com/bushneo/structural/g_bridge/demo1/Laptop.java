package com.bushneo.structural.g_bridge.demo1;

/**
 * 笔记本
 * @author bushneo
 * @create 2019-01-01 13:21
 */
public class Laptop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}
