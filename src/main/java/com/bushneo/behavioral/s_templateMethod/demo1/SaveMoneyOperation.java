package com.bushneo.behavioral.s_templateMethod.demo1;

/**
 * 存钱
 * @author bushneo
 * @create 2019-01-05 16:09
 */
public class SaveMoneyOperation extends BankTemplateMethod {

    @Override
    void specificBusiness() {
        System.out.println("存100万");
    }
}
