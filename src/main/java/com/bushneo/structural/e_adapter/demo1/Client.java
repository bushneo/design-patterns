package com.bushneo.structural.e_adapter.demo1;

/**
 * 客户端
 * @author bushneo
 * @create 2019-01-01 10:14
 */
public class Client {
    
    public static void main(String[] args) {
//        testExtends();
        testAssemble();
    }

    /**
     * 继承方式
     */
    public static void testExtends(){
        Client client = new Client();

        Target target =  new AdapterByExtends();
        client.sendRequest(target);

    }

    /**
     * 组合方式
     */
    public static void testAssemble(){
        Client client = new Client();

        Adaptee adaptee = new Adaptee();
        Target target = new AdapterByAssemble(adaptee);
        client.sendRequest(target);
    }

    public void sendRequest(Target target){
        target.handleRequest();
        System.out.println("发送请求！");
    }

}
