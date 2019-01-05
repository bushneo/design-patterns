package com.bushneo.behavioral.r_strategy.demo1;

/**
 * 铂金会员
 * @author bushneo
 * @create 2019-01-05 15:33
 */
public class PlatinumMember implements Strategy {

    @Override
    public double getPrice(double price) {
        System.out.println("铂金会员打0.8折");
        return price*0.8;
    }
}
