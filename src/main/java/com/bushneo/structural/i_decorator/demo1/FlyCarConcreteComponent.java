package com.bushneo.structural.i_decorator.demo1;

/**
 * 具体组件角色（真实对象）
 * @author bushneo
 * @create 2019-01-01 17:56
 */
public class FlyCarConcreteComponent extends SuperCarDecorator {

    public FlyCarConcreteComponent(CarComponent carComponent) {
        super(carComponent);
    }

    public void fly(){
        System.out.println("能飞！");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
