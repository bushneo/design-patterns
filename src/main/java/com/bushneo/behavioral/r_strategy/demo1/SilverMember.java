package com.bushneo.behavioral.r_strategy.demo1;

/**
 * 白银会员
 * @author bushneo
 * @create 2019-01-05 15:33
 */
public class SilverMember implements Strategy {

    @Override
    public double getPrice(double price) {
        System.out.println("白银会员打0.9折");
        return price*0.9;
    }
}
