package com.bushneo.behavioral.r_strategy.demo1;

/**
 * @author bushneo
 * @create 2019-01-05 15:44
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy1 = new GoldMember();
        Context context = new Context(strategy1);
        context.pringPrice(1000);
    }

}
