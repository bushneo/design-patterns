package com.bushneo.behavioral.o_command.demo1;

/**
 * 调用者
 * @author bushneo
 * @create 2019-01-05 13:14
 */
public class Invoke {

    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }


    public void call(){
        command.execute();
    }
}
