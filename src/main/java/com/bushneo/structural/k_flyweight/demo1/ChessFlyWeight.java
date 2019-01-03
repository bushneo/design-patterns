package com.bushneo.structural.k_flyweight.demo1;

/**
 * 抽象享元类
 * @author bushneo
 * @create 2019-01-01 19:01
 */
public interface ChessFlyWeight {

    void setColor(String color);

    String getColor();

    void display(ChessUnsharedConcreteFlyWeight c);
}
