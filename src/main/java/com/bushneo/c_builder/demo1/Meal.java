package com.bushneo.c_builder.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bushneo
 * @create 2018-12-31 0:19
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float totalCost = 0f;
        for (Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void showMeal(){
        for (Item item : items) {
            System.out.print("Item:"+item.name());
            System.out.print(",Packing:"+item.packing().pack());
            System.out.println(",Price:"+item.price());
        }
    }

}
