package com.bushneo.structural.f_proxy.dynamicProxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author bushneo
 * @create 2019-01-01 11:40
 */
public class StarHandler implements InvocationHandler {

    private StarRole starRole;

    public StarHandler(StarRole starRole) {
        this.starRole = starRole;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        System.out.println("助理面谈，签合同");
        if ("sing".equals(method.getName())){
            obj = method.invoke(starRole,args);
        }
        System.out.println("演唱结束，助理收款");

        return obj;
    }
}
