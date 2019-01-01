package com.bushneo.structural.f_proxy.staticProxy.demo1;

/**
 * 周杰伦助理，代理其他事宜
 * @author bushneo
 * @create 2019-01-01 11:25
 */
public class JayProxyStar implements StarRole {

    private StarRole starRole;

    public JayProxyStar(StarRole starRole) {
        this.starRole = starRole;
    }

    @Override
    public void confer() {
        System.out.println("助理面谈相关事宜");
    }

    @Override
    public void signContract() {
        System.out.println("助理代签合同");
    }

    @Override
    public void sing() {
        System.out.println("周董开始唱歌：");
        starRole.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("助理代收款项");
    }
}
