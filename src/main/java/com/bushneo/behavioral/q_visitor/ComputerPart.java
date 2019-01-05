package com.bushneo.behavioral.q_visitor;

/**
 * 电脑零件接口
 * @author bushneo
 * @create 2019-01-05 14:52
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
