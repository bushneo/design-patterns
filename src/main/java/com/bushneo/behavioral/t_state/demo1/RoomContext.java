package com.bushneo.behavioral.t_state.demo1;

/**
 * 房间
 * @author bushneo
 * @create 2019-01-05 16:27
 */
public class RoomContext {
    private State state;

    public void setState(State state) {
        System.out.println("修改状态");
        this.state = state;
        state.handle();
    }
}
