package com.bushneo.behavioral.u_observer.demo1;

/**
 * 具体的观察者类
 * @author bushneo
 * @create 2019-01-05 16:48
 */
public class ObserverObj implements Observer {

    private int state;

    @Override
    public void updateInfo(Subject subject) {
        state = subject.getState();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
