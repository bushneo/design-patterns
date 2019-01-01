package com.bushneo.structural.i_decorator.demo1;

/**
 * 具体组件角色（真实对象）
 * @author bushneo
 * @create 2019-01-01 17:56
 */
public class SpeakCarConcreteComponent extends SuperCarDecorator {

    public SpeakCarConcreteComponent(CarComponent carComponent) {
        super(carComponent);
    }

    public void speak(){
        System.out.println("能说话！");
    }

    @Override
    public void move() {
        super.move();
        speak();
    }
}
