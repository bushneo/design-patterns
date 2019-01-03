package com.bushneo.structural.k_flyweight.demo1;

/**
 * 非共享享元类
 * 棋子的坐标不能共享
 * @author bushneo
 * @create 2019-01-01 19:09
 */
public class ChessUnsharedConcreteFlyWeight {

    private int x,y;

    public ChessUnsharedConcreteFlyWeight(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
