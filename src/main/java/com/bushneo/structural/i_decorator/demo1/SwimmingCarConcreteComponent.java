package com.bushneo.structural.i_decorator.demo1;

/**
 * 具体组件角色（真实对象）
 * @author bushneo
 * @create 2019-01-01 17:56
 */
public class SwimmingCarConcreteComponent extends SuperCarDecorator {

    public SwimmingCarConcreteComponent(CarComponent carComponent) {
        super(carComponent);
    }

    public void swimming(){
        System.out.println("能潜水！");
    }

    @Override
    public void move() {
        super.move();
        swimming();
    }
}
