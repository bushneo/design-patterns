package com.bushneo.structural.i_decorator.demo1;

/**
 * 普通汽车
 * 具体组件角色（真实对象）
 * @author bushneo
 * @create 2019-01-01 18:03
 */
public class OrdinaryCarConcreteComponent implements CarComponent {

    @Override
    public void move() {
        System.out.println("只能在陆地上跑！");
    }
}
