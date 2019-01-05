package com.bushneo.behavioral.o_command.demo1;

/**
 * @author bushneo
 * @create 2019-01-05 13:10
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //执行命令前，可以做其他处理
        System.out.println("执行命令前，执行了其他处理");
        receiver.action();
        //执行命令后，可以做其他处理
        System.out.println("执行命令后，执行了其他处理");

    }
}
