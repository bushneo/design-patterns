package com.bushneo.creational.b_factory.demo3;

/**
 * 引擎便宜
 * @author bushneo
 * @create 2018-12-30 16:21
 */
public class CheapEngine implements Engine {

    @Override
    public void run() {
        System.out.println("便宜的发动机，动力不足啊");
    }
}
