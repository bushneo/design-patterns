package com.bushneo.creational.c_builder.demo1;

/**
 * @author bushneo
 * @create 2018-12-31 0:25
 */
public class MealBuilder {

    public Meal comboA(){
        Meal meal = new Meal();
        meal.addItem(new FriedChickBurger());
        meal.addItem(new OrleanBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal comboB(){
        Meal meal = new Meal();
        meal.addItem(new OrleanBurger());
        meal.addItem(new Coffee());
        return meal;
    }

}
