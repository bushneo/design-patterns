package com.bushneo.structural.f_proxy.dynamicProxy.demo1;

import java.lang.reflect.Proxy;

/**
 * 动态代理（基于JDK方式）
 * 还有基于javaassist字节码操作，CGLIB实现的动态代理
 *
 * @author bushneo
 * @create 2019-01-01 11:51
 */
public class Client {

    public static void main(String[] args) {
        StarRole jay = new Jay();
        StarHandler starHandler = new StarHandler(jay);
        StarRole proxyInstance = (StarRole) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{StarRole.class}, starHandler);
        proxyInstance.sing();

    }
}
