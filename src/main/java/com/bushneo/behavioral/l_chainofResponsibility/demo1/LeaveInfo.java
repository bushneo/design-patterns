package com.bushneo.behavioral.l_chainofResponsibility.demo1;

/**
 * 请假相关信息
 * @author bushneo
 * @create 2019-01-03 22:30
 */
public class LeaveInfo {

    private String empName;
    private int leaveDays;
    private String reason;


    public LeaveInfo(String empName, int leaveDays, String reason) {
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "LeaveInfo{" +
                "empName='" + empName + '\'' +
                ", leaveDays=" + leaveDays +
                ", reason='" + reason + '\'' +
                '}';
    }
}
