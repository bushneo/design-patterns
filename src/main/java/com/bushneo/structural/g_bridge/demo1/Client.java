package com.bushneo.structural.g_bridge.demo1;

/**
 * 多维度变化的场景下，不使用桥接模式
 * 拓展困难，若新增一个维度，会造成类的个数暴增
 * @author bushneo
 * @create 2019-01-01 13:28
 */
public class Client {

    public static void main(String[] args) {
          Computer computer1 = new AppleDesktop();
          computer1.sale();
    }
}
