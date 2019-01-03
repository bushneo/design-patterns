package com.bushneo.structural.k_flyweight.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bushneo
 * @create 2019-01-01 19:15
 */
public class ChessFlyWeightFactory {
    private static Map<String,ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color){
        if (map.get(color) != null){
            return map.get(color);
        }else {
            ChessFlyWeight chessFlyWeight = new ChessConcreteFlyWeight(color);
            map.put(color,chessFlyWeight);
            return chessFlyWeight;
        }
    }

}
