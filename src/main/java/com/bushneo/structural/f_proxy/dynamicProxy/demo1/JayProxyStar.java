package com.bushneo.structural.f_proxy.dynamicProxy.demo1;

import com.bushneo.structural.f_proxy.staticProxy.demo1.StarRole;

/**
 * 周杰伦助理，代理其他事宜
 * @author bushneo
 * @create 2019-01-01 11:25
 */
public class JayProxyStar implements StarRole {

    private StarHandler starHandler;

    public JayProxyStar(StarHandler starHandler) {
        this.starHandler = starHandler;
    }


    @Override
    public void confer() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void sing() {

    }

    @Override
    public void collectMoney() {

    }
}
