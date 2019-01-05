package com.bushneo.behavioral.q_visitor;

/**
 * 显示器
 * @author bushneo
 * @create 2019-01-05 14:57
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
