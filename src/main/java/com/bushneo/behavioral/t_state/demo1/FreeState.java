package com.bushneo.behavioral.t_state.demo1;

/**
 * 空闲状态
 * @author bushneo
 * @create 2019-01-05 16:23
 */
public class FreeState implements State {

    @Override
    public void handle() {
        System.out.println("房间状态：空闲");
    }
}
