package com.bushneo.d_prototype;

import java.io.*;
import java.util.Date;

/**
 * 深克隆（使用序列化和反序列化的方式）
 * @author bushneo
 * @create 2018-12-31 20:31
 */
public class TestSerializableDeepClone {

    public static void main(String[] args) {
        Date date = new Date();
        SheepC sheepC = new SheepC();
        sheepC.setBirthday(date);
        sheepC.setName("羊C");

        try {
            //序列化
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(sheepC);
            byte[] bytes = bos.toByteArray();

            ByteArrayInputStream bis= new ByteArrayInputStream(bytes);
            ObjectInputStream ois= new ObjectInputStream(bis);

            //克隆好的对象
            SheepC sheepC1 = (SheepC) ois.readObject();

            date.setTime(15554444888787L);//修改时间，深克隆不会影响到下次克隆羊的出生时间，因为他们出生日期的Date对象不同

            System.out.println("本体：" + sheepC);

            System.out.println("克隆体：" + sheepC1);



        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
