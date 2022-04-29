package com.bushneo.behavioral.l_chainofResponsibility.demo2;

public abstract class AbstractAuthenticationService<T extends AuthenticationRequest> {

    void before(T request) {
    }

    void after(T request) {
    }

    // 抽象方法
    protected abstract void practicalExecute(T request);

    public void authentication(T request) {
        // 前置拦截操作，包括不限于责任链模式调用
        before(request);
        // 策略模式实现，调用具体认证类，比如二要素认证或三要素认证
        practicalExecute(request);
        // 资源清理或记录认证完成信息
        after(request);
    }
}