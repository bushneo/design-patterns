package com.bushneo.behavioral.u_observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题对象
 * @author bushneo
 * @create 2019-01-05 16:44
 */
public class Subject {

    List<Observer> list = new ArrayList<>();

    private int state;

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public int getState() {
        return state;
    }

    public void addObserver(Observer observer){
        list.add(observer);
    }
    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    public void notifyAllObserver(){
        for (Observer observer : list) {
            observer.updateInfo(this);
        }
    }
}
