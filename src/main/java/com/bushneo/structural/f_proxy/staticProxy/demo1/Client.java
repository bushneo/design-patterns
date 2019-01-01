package com.bushneo.structural.f_proxy.staticProxy.demo1;

/**
 * 静态代理
 * @author bushneo
 * @create 2019-01-01 11:30
 */
public class Client {
    
    public static void main(String[] args) {
         StarRole jay =  new Jay();
         StarRole jayProxy = new JayProxyStar(jay);

         jayProxy.confer();
         jayProxy.signContract();
         jayProxy.sing();
         jayProxy.collectMoney();

    }

}
