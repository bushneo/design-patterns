package com.bushneo.behavioral.n_mediator.demo1;

/**
 * @author bushneo
 * @create 2019-01-05 12:36
 */
public class Market implements Department {

    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("市场部",this);
    }

    @Override
    public void handleByMyself() {
        System.out.println("好的，立刻去找客户");
    }

    @Override
    public void handleByOther() {
        System.out.println("申请资金。。");
    }
}
