package com.bushneo.b_factory.demo3;

/**
 * 昂贵的座椅
 * @author bushneo
 * @create 2018-12-30 16:20
 */
public class ExpensiveSeat implements Seat {


    @Override
    public void adjustmentSeat() {
        System.out.println("贵的座椅");
    }
}
