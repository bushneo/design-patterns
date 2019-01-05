package com.bushneo.behavioral.u_observer.demo2;

/**
 * @author bushneo
 * @create 2019-01-05 17:48
 */
public class Client {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();
        ObserverObj observerObj1 = new ObserverObj();
        ObserverObj observerObj2 = new ObserverObj();
        ObserverObj observerObj3 = new ObserverObj();

        mySubject.addObserver(observerObj1);
        mySubject.addObserver(observerObj2);
        mySubject.addObserver(observerObj3);

        mySubject.setState(5);
        System.out.println("被观察者的状态修改为：" + mySubject.getState());
        System.out.println("===观察者的状态：");
        System.out.println(observerObj1.getState());
        System.out.println(observerObj1.getState());
        System.out.println(observerObj1.getState());

        mySubject.setState(6);
        System.out.println("被观察者的状态修改为：" + mySubject.getState());
        System.out.println("===观察者的状态：");
        System.out.println(observerObj1.getState());
        System.out.println(observerObj1.getState());
        System.out.println(observerObj1.getState());
    }

}
