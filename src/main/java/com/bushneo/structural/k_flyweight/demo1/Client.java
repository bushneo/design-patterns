package com.bushneo.structural.k_flyweight.demo1;

/**
 * @author bushneo
 * @create 2019-01-01 19:19
 */
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");

        chess1.display(new ChessUnsharedConcreteFlyWeight(66,66));
        chess2.display(new ChessUnsharedConcreteFlyWeight(88,88));

        ChessFlyWeight chess3 = ChessFlyWeightFactory.getChess("白色");
        chess3.display(new ChessUnsharedConcreteFlyWeight(11,22));

    }

}
