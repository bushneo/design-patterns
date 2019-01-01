package com.bushneo.structural.e_adapter.demo1;

/**
 * 适配器(通过继承的方式实现，不推荐)
 * 因为java是单继承，使用该种方式以后难拓展，应该使用组合的方式
 * @author bushneo
 * @create 2019-01-01 10:34
 */
public class AdapterByExtends extends Adaptee implements Target{

    @Override
    public void handleRequest() {
        super.request();
    }
}
