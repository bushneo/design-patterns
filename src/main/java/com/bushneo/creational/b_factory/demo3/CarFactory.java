package com.bushneo.creational.b_factory.demo3;


/**
 * @author bushneo
 * @create 2018-12-30 16:07
 */
public interface CarFactory {

    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();

}
