package com.bushneo.creational.d_prototype;

import java.util.Date;

/**
 * 测试浅克隆
 *
 * @author bushneo
 * @create 2018-12-31 10:19
 */
public class TestShallowClone {

    public static void main(String[] args) {
        try {
            Date date = new Date();
            SheepA sheepA = new SheepA();
            sheepA.setBirthday(date);
            sheepA.setName("羊A");

            SheepA sheepA1 = (SheepA) sheepA.clone();//SheepA若不实现Cloneable接口，调用clone方法会报错
            sheepA1.setName("克隆羊A1");

            date.setTime(15554444888787L);//修改时间，会影响到下次克隆羊的出生时间，因为他们出生日期的Date对象是用一个，这就是浅克隆存在的问题

            System.out.println("本体："+sheepA);

            System.out.println("克隆体："+sheepA1);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
