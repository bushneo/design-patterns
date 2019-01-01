package com.bushneo.structural.i_decorator.demo1;

/**
 * 装饰角色
 * 持有一个抽象组件的引用，并将请求转发给真实对象，这样便可以实现真实对象调用前后新增的功能
 * @author bushneo
 * @create 2019-01-01 17:53
 */
public class SuperCarDecorator implements CarComponent {

    CarComponent carComponent;

    public SuperCarDecorator(CarComponent carComponent) {
        this.carComponent = carComponent;
    }

    @Override
    public void move() {
        carComponent.move();
    }
}
