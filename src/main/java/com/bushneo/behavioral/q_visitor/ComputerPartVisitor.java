package com.bushneo.behavioral.q_visitor;

/**
 * 电脑零件接口访问者
 * @author bushneo
 * @create 2019-01-05 14:54
 */
public interface ComputerPartVisitor {


    /**
     * 电脑访问
     * @param computer
     */
    void visit(Computer computer);

    /**
     * 键盘访问
     * @param keyboard 键盘对象
     */
    void visit(Keyboard keyboard);

    /**
     * 显示器访问
     * @param monitor
     */
    void visit(Monitor monitor);

    /**
     * 鼠标访问
     * @param mouse
     */
    void visit(Mouse mouse);

}
