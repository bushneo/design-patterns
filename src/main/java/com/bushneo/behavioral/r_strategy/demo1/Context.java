package com.bushneo.behavioral.r_strategy.demo1;

/**
 * @author bushneo
 * @create 2019-01-05 15:42
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void pringPrice(double price){
        System.out.println("原价："+price+",优惠后的价格："+strategy.getPrice(price));
    }
}
