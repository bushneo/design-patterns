package com.bushneo.creational.d_prototype;

import java.util.Date;

/**
 * 测试深克隆（重写clone方法的方式）
 *
 * @author bushneo
 * @create 2018-12-31 10:19
 */
public class TestDeepClone {

    public static void main(String[] args) {
        try {
            Date date = new Date();
            SheepB sheepB = new SheepB();
            sheepB.setBirthday(date);
            sheepB.setName("羊B");

            SheepB sheepB1 = (SheepB) sheepB.clone();//SheepB若不实现Cloneable接口，调用clone方法会报错
            sheepB1.setName("克隆羊B1");

            date.setTime(15554444888787L);//修改时间，深克隆不会影响到下次克隆羊的出生时间，因为他们出生日期的Date对象不同

            System.out.println("本体：" + sheepB);

            System.out.println("克隆体：" + sheepB1);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
