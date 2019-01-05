package com.bushneo.behavioral.v_memento.demo1;

/**
 * @author bushneo
 * @create 2019-01-05 18:20
 */
public class Client {
    public static void main(String[] args) {
          CareTaker careTaker = new CareTaker();
        Employee employee = new Employee("员工A",20,"深圳xxxx");
        System.out.println(employee);

        careTaker.setEmployeeMemento(employee.memento());

        employee.setAge(18);
        careTaker.setEmployeeMemento(employee.memento());
        System.out.println(employee);

        employee.recovery(careTaker.getEmployeeMemento());
        System.out.println("撤销："+employee);
        employee.recovery(careTaker.getEmployeeMemento());

    }

}
