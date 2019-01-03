package com.bushneo.behavioral.l_chainofResponsibility.demo1;

/**
 * 组长
 * @author bushneo
 * @create 2019-01-03 22:36
 */
public class GroupLeader extends Leader {

    public GroupLeader(String name) {
        super(name);
    }

    @Override
    public void handRequest(LeaveInfo leaveInfo) {
        if (leaveInfo.getLeaveDays() <=1){
            System.out.println("员工："+leaveInfo.getEmpName()+"请假，天数："+leaveInfo.getLeaveDays()+",理由："+leaveInfo.getReason());
            System.out.println("组长:"+this.name+",审批通过！");
        }else{
            if (this.nextLeader != null){
                this.nextLeader.handRequest(leaveInfo);
            }
        }
    }
}
