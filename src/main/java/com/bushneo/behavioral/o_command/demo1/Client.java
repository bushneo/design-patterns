package com.bushneo.behavioral.o_command.demo1;

/**
 * @author bushneo
 * @create 2019-01-05 13:15
 */
public class Client {

    public static void main(String[] args) {
          Command command = new ConcreteCommand(new Receiver());
          Invoke invoke = new Invoke(command);

          invoke.call();
    }
}
