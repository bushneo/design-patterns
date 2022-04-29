package com.bushneo.behavioral.l_chainofResponsibility.demo2;

/**
 * @author bushneo
 * @version 1.0.0
 * @createTime 2022年04月24日 11:45:00
 */
public interface BaseAuthenticationStrategy<T> {

    String mark();

    void execute(T t);
}
