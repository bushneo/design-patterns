package com.bushneo.behavioral.q_visitor;

/**
 * @author bushneo
 * @create 2019-01-05 14:55
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
