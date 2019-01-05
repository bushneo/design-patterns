package com.bushneo.behavioral.n_mediator.demo1;

/**
 * 抽象中介者
 * @author bushneo
 * @create 2019-01-05 12:29
 */
public interface Mediator {

    void register(String name,Department department);

    void command(String name);

}
