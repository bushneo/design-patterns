package com.bushneo.behavioral.s_templateMethod.demo1;

/**
 * @author bushneo
 * @create 2019-01-05 16:10
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod operation = new SaveMoneyOperation();
        operation.process();

        BankTemplateMethod templateMethod1 = new BankTemplateMethod() {
            @Override
            void specificBusiness() {
                System.out.println("我要理财");
            }
        };

        templateMethod1.process();
    }

}
