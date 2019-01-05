package com.bushneo.behavioral.n_mediator.demo1;

/**
 * 部门接口
 * @author bushneo
 * @create 2019-01-05 12:22
 */
public interface Department {
    /**
     * 自行处理
     */
    void handleByMyself();

    /**
     * 他人处理
     */
    void handleByOther();
}
