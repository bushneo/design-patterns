package com.bushneo.behavioral.v_memento.demo1;

import java.util.List;
import java.util.Stack;

/**
 * 负责管理备忘录对象
 * @author bushneo
 * @create 2019-01-05 18:16
 */
public class CareTaker {

    private EmployeeMemento employeeMemento;

    /**
     * 保存多个备忘点
     */
    private Stack<EmployeeMemento> stack = new Stack<>();

    public EmployeeMemento getEmployeeMemento() {

        return stack.empty()? null:stack.pop();
    }

    public void setEmployeeMemento(EmployeeMemento employeeMemento) {
        this.employeeMemento = employeeMemento;
        stack.push(employeeMemento);
    }
}
