package com.bushneo.behavioral.q_visitor;

/**
 * 鼠标
 * @author bushneo
 * @create 2019-01-05 14:58
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
