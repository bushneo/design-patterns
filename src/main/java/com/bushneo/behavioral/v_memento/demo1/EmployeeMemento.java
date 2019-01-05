package com.bushneo.behavioral.v_memento.demo1;

/**
 * 员工备忘录对象
 * @author bushneo
 * @create 2019-01-05 18:10
 */
public class EmployeeMemento {

    private String name;
    private int age;
    private String address;

    public EmployeeMemento(Employee employee) {
        this.name = employee.getName();
        this.age = employee.getAge();
        this.address = employee.getAddress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeMemento{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
