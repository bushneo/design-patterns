package com.bushneo.behavioral.v_memento.demo1;

/**
 * 员工
 * @author bushneo
 * @create 2019-01-05 18:10
 */
public class Employee {

    private String name;
    private int age;
    private String address;

    public Employee() {
    }

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 进行备忘操作
     * @return
     */
    public EmployeeMemento memento(){
        return new EmployeeMemento(this);
    }

    /**
     * 恢复操作
     * @param employeeMemento
     */
    public void recovery(EmployeeMemento employeeMemento){
        if (employeeMemento != null){

            this.name = employeeMemento.getName();
            this.age = employeeMemento.getAge();
            this.address = employeeMemento.getAddress();
        }

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
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
