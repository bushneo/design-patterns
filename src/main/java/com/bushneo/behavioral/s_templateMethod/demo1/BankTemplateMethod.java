package com.bushneo.behavioral.s_templateMethod.demo1;

/**
 * 银行业务办理流程
 * @author bushneo
 * @create 2019-01-05 16:02
 */
public abstract class BankTemplateMethod {

    public void takeNumber(){
        System.out.println("取号");
    }

    /**
     * 具体业务
     */
    abstract void specificBusiness();


    public void serviceScore(){
        System.out.println("服务评分");
    }

    /**
     * 流程，加final修饰，防止被子类修改流程
     */
    public final void process(){
        takeNumber();
        specificBusiness();
        serviceScore();
    }
}
