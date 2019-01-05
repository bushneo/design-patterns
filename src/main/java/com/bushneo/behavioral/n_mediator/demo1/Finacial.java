package com.bushneo.behavioral.n_mediator.demo1;

/**
 * 财务部
 * @author bushneo
 * @create 2019-01-05 12:26
 */
public class Finacial implements Department {
    private Mediator mediator;

    public Finacial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("财务部",this);
    }

    @Override
    public void handleByMyself() {
        System.out.println("好的，立刻发放资金");
    }

    @Override
    public void handleByOther() {
        System.out.println("汇报工作");
    }
}
