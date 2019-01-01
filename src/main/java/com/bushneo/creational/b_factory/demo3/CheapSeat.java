package com.bushneo.creational.b_factory.demo3;

/**
 * 便宜的座椅
 * @author bushneo
 * @create 2018-12-30 16:21
 */
public class CheapSeat implements Seat{

    @Override
    public void adjustmentSeat() {
        System.out.println("便宜的座椅");
    }
}
