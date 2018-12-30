package com.bushneo.b_factory.demo3;

/**
 * 低端车
 * @author bushneo
 * @create 2018-12-30 16:18
 */
public class CarLowFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new CheapEngine();
    }

    @Override
    public Seat createSeat() {
        return new CheapSeat();
    }

    @Override
    public Tyre createTyre() {
        return new CheapTyre();
    }
}
