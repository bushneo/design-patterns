package com.bushneo.behavioral.l_chainofResponsibility.demo1;

/**
 * 领导（抽象类）
 * @author bushneo
 * @create 2019-01-03 22:24
 */
public abstract class Leader {
    String name;
    Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handRequest(LeaveInfo leaveInfo);
}
