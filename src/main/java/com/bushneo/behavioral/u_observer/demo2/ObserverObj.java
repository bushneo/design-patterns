package com.bushneo.behavioral.u_observer.demo2;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * @author bushneo
 * @create 2019-01-05 17:42
 */
public class ObserverObj implements Observer {

    private int state;

    @Override
    public void update(Observable o, Object arg) {
        state = ((MySubject)o).getState();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
