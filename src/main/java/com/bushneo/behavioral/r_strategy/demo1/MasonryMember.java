package com.bushneo.behavioral.r_strategy.demo1;

/**
 * 钻石会员
 * @author bushneo
 * @create 2019-01-05 15:33
 */
public class MasonryMember implements Strategy {

    @Override
    public double getPrice(double price) {
        System.out.println("砖石会员打0.7折");
        return price*0.7;
    }
}
