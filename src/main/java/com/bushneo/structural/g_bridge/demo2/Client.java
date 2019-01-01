package com.bushneo.structural.g_bridge.demo2;

/**
 * 测试桥接模式
 * @author bushneo
 * @create 2019-01-01 14:45
 */
public class Client {
    public static void main(String[] args) {
          Computer computer1 = new Desktop(new LenovoBrand());
          computer1.sale();

          Computer computer2 = new Laptop(new AppleBrand());
          computer2.sale();
    }

}
