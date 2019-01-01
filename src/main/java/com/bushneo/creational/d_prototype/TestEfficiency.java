package com.bushneo.creational.d_prototype;

import java.util.Date;

/**
 * 测试效率
 * @author bushneo
 * @create 2019-01-01 9:15
 */
public class TestEfficiency {

    public static void main(String[] args) throws Exception {
        testNew();
        testClone();
    }

    /**
     * 测试通过单纯new方式创建相同的对象效率
     * @throws InterruptedException
     */
    public static void testNew() throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            newSheepA();
        }
        long end = System.currentTimeMillis();
        System.out.println("new方式总耗时（s）："+(end-start));
    }

    /**
     * 测试通过new一个对象，然后clone的方式效率
     * @throws Exception
     */
    public static void testClone() throws Exception {
        long start = System.currentTimeMillis();
        SheepB sheepB = cloneSheepB();
        for (int i = 0; i < 1000; i++) {
            sheepB.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("clone方式总耗时(s)："+(end-start));
    }

    private static void newSheepA() throws InterruptedException {
        SheepA sheepA = new SheepA();
        sheepA.setName("羊A");
        sheepA.setBirthday(new Date());
        /*---------------模拟new一个对象所消耗更多的时间，方便观察时间差------------------*/
        Thread.sleep(2);
        /*---------------模拟new一个对象所消耗更多的时间，方便观察时间差------------------*/
    }

    private static SheepB cloneSheepB() throws InterruptedException {
        SheepB sheepB = new SheepB();
        sheepB.setName("羊B");
        sheepB.setBirthday(new Date());
        /*---------------模拟new一个对象所消耗更多的时间，方便观察时间差------------------*/
        Thread.sleep(2);
        /*---------------模拟new一个对象所消耗更多的时间，方便观察时间差------------------*/
        return sheepB;
    }
}
