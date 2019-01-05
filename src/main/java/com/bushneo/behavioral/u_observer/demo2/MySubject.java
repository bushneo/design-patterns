package com.bushneo.behavioral.u_observer.demo2;

import java.util.Observable;

/**
 * 具体的被观察者
 * @author bushneo
 * @create 2019-01-05 17:44
 */
public class MySubject extends Observable {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;

        setChanged();
        notifyObservers(state);
    }
}
