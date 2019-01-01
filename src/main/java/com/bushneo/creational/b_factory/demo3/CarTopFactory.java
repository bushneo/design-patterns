package com.bushneo.creational.b_factory.demo3;

/**
 * 高端车
 * @author bushneo
 * @create 2018-12-30 16:18
 */
public class CarTopFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new ExpensiveEngine();
    }

    @Override
    public Seat createSeat() {
        return new ExpensiveSeat();
    }

    @Override
    public Tyre createTyre() {
        return new ExpensiveTyre();
    }
}
