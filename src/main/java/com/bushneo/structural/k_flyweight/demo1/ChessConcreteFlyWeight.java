package com.bushneo.structural.k_flyweight.demo1;

/**
 * 具体享元类
 * 棋子的颜色可以共享
 * @author bushneo
 * @create 2019-01-01 19:06
 */
public class ChessConcreteFlyWeight implements ChessFlyWeight {

    private String color;

    public ChessConcreteFlyWeight(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(ChessUnsharedConcreteFlyWeight c) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置：x="+c.getX()+",y="+c.getY());
    }
}
