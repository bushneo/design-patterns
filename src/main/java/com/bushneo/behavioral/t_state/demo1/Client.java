package com.bushneo.behavioral.t_state.demo1;

/**
 * @author bushneo
 * @create 2019-01-05 16:29
 */
public class Client {
    public static void main(String[] args) {
          RoomContext roomContext = new RoomContext();
          roomContext.setState(new FreeState());
          roomContext.setState(new ReserveState());
          roomContext.setState(new CheckedInState());
    }

}
