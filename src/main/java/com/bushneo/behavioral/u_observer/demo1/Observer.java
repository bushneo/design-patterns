package com.bushneo.behavioral.u_observer.demo1;

/**
 * 观察者接口
 * @author bushneo
 * @create 2019-01-05 16:43
 */
public interface Observer {
    /**
     * 修改信息
     */
    void updateInfo(Subject subject);
}
