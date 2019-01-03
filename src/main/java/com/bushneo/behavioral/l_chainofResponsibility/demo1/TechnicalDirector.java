package com.bushneo.behavioral.l_chainofResponsibility.demo1;

/**
 * 技术总监
 * @author bushneo
 * @create 2019-01-03 22:40
 */
public class TechnicalDirector extends Leader {

    public TechnicalDirector(String name) {
        super(name);
    }

    @Override
    public void handRequest(LeaveInfo leaveInfo) {
        if (leaveInfo.getLeaveDays() <=7){
            System.out.println("员工："+leaveInfo.getEmpName()+"请假，天数："+leaveInfo.getLeaveDays()+",理由："+leaveInfo.getReason());
            System.out.println("技术总监:"+this.name+",审批通过！");
        }else{
            if (this.nextLeader != null){
                this.nextLeader.handRequest(leaveInfo);
            }
        }
    }
}
