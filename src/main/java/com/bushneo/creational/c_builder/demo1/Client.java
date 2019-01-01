package com.bushneo.creational.c_builder.demo1;

/**
 * 测试
 * @author bushneo
 * @create 2018-12-31 0:27
 */
public class Client {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.comboA();
        meal.showMeal();
        System.out.println("total Cost:"+meal.getCost());

        Meal meal2 = mealBuilder.comboB();
        meal2.showMeal();
        System.out.println("total Cost:"+meal.getCost());
    }
}
