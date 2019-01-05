package com.bushneo.behavioral.u_observer.demo1;

/**
 * @author bushneo
 * @create 2019-01-05 17:29
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();

        ObserverObj observerObj1 = new ObserverObj();
        ObserverObj observerObj2 = new ObserverObj();
        ObserverObj observerObj3 = new ObserverObj();

        subject.addObserver(observerObj1);
        subject.addObserver(observerObj2);
        subject.addObserver(observerObj3);

        subject.setState(1);
        System.out.println("被观察者的状态修改为：" + subject.getState());
        System.out.println("===观察者的状态：");
        System.out.println(observerObj1.getState());
        System.out.println(observerObj1.getState());
        System.out.println(observerObj1.getState());

        subject.setState(3);
        System.out.println("被观察者的状态修改为：" + subject.getState());
        System.out.println("===观察者的状态：");
        System.out.println(observerObj1.getState());
        System.out.println(observerObj1.getState());
        System.out.println(observerObj1.getState());
    }
}
