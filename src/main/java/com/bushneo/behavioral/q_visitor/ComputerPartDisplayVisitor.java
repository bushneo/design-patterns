package com.bushneo.behavioral.q_visitor;

/**
 * @author bushneo
 * @create 2019-01-05 15:08
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("电脑");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("鼠标");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("显示器");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("鼠标");
    }
}
