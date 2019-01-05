package com.bushneo.behavioral.r_strategy.demo1;

/**
 * 黄金会员
 * @author bushneo
 * @create 2019-01-05 15:33
 */
public class GoldMember implements Strategy {

    @Override
    public double getPrice(double price) {
        System.out.println("黄金会员打0.85折");
        return price*0.85;
    }
}
