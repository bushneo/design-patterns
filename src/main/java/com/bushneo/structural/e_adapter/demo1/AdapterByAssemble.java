package com.bushneo.structural.e_adapter.demo1;

/**
 * 适配器(通过组合的方式实现，推荐)
 * 易拓展
 * @author bushneo
 * @create 2019-01-01 10:34
 */
public class AdapterByAssemble implements Target{

    private Adaptee adaptee;

    public AdapterByAssemble(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
