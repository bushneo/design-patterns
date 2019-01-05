package com.bushneo.behavioral.t_state.demo1;

/**
 * @author bushneo
 * @create 2019-01-05 16:26
 */
public class CheckedInState implements State {

    @Override
    public void handle() {
        System.out.println("房间状态：已入住！");
    }
}
