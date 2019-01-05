package com.bushneo.behavioral.r_strategy.demo1;

/**
 * 非会员
 * @author bushneo
 * @create 2019-01-05 15:37
 */
public class NonMember implements Strategy {

    @Override
    public double getPrice(double price) {
        System.out.println("非会员不打折");
        return price;
    }
}
