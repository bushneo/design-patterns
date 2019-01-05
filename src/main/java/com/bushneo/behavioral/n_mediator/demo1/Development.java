package com.bushneo.behavioral.n_mediator.demo1;

/**
 * 研发部
 * @author bushneo
 * @create 2019-01-05 12:24
 */
public class Development implements Department {

    private Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("研发部",this);
    }

    @Override
    public void handleByMyself() {
        System.out.println("好的，立刻开发项目");
    }

    @Override
    public void handleByOther() {
        System.out.println("申请经费");
        mediator.command("财务部");
    }
}
