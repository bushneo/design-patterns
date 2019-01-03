package com.bushneo.behavioral.m_iterator.demo1;

/**
 * @author bushneo
 * @create 2019-01-03 23:40
 */
public class Client {
    public static void main(String[] args) {
          MyContainer myContainer = new MyContainer();
        myContainer.addObject(1);
        myContainer.addObject(2);
        myContainer.addObject(3);
        myContainer.addObject(4);
        myContainer.addObject(15);
        myContainer.addObject(13);
        myContainer.addObject(12);
        MyIterator iterator = myContainer.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getCurrentObj());
            iterator.next();//游标下移
        }
    }

}
