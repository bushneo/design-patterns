package com.bushneo.behavioral.q_visitor;

/**
 * @author bushneo
 * @create 2019-01-05 15:09
 */
public class Client {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }

}
