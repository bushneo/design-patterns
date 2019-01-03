package com.bushneo.behavioral.l_chainofResponsibility.demo1;

/**
 * 测试
 * @author bushneo
 * @create 2019-01-03 22:46
 */
public class Client {
    public static void main(String[] args) {
        Leader leader1 = new GroupLeader("张三");
        Leader leader2 = new TechnicalDirector("李四");
        Leader leader3 = new Boss("王五");

        leader1.setNextLeader(leader2);
        leader2.setNextLeader(leader3);

        LeaveInfo leaveInfo = new LeaveInfo("王麻子", 10, "出国旅游");
        leader1.handRequest(leaveInfo);


    }

}
