package com.bushneo.creational.a_singleton;

import com.bushneo.creational.a_singleton.demo1.SingletonHunger;
import com.bushneo.creational.a_singleton.demo2.SingletonLazy1;
import com.bushneo.creational.a_singleton.demo2.SingletonLazy2;
import com.bushneo.creational.a_singleton.demo3.SingletonDCL;
import com.bushneo.creational.a_singleton.demo4.SingletonStaticInnerClass;
import com.bushneo.creational.a_singleton.demo5.SingletonEnum;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试
 * @author bushneo
 * @create 2018-12-29 23:14
 */
public class Client {
    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(50);
        long start = System.currentTimeMillis();
        int threadNum = 300;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++)
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
//                    test1();
//                    test2_1();
//                    test2_2();
                    test3();
//                    test4();
//                    test5();

                    countDownLatch.countDown();
                }
            });

        try {
            //等待子线程执行完
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("========总耗时ms=========="+(end-start));
        threadPool.shutdown();
    }

    public static void test1() {
        SingletonHunger singleHunger = SingletonHunger.getInstance();
        System.out.println(singleHunger);
    }

    public static void test2_1() {
        SingletonLazy1 singletonLazy1 = SingletonLazy1.getInstance();
        System.out.println(singletonLazy1);
    }

    public static void test2_2() {
        SingletonLazy2 singletonLazy2 = SingletonLazy2.getInstance();
        System.out.println(singletonLazy2);
    }

    /**
     * 比较难测出不加volatile关键字的并发问题
     */
    public static void test3() {
        SingletonDCL instance = SingletonDCL.getInstance();
        System.out.println(instance);
    }
    public static void test4() {
        SingletonStaticInnerClass instance = SingletonStaticInnerClass.getInstance();
        System.out.println(instance);
    }
    public static void test5() {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        System.out.println(instance == instance2);
        instance.sayHello();
    }
}
