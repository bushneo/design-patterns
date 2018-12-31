package com.bushneo.d_prototype;

import java.util.Date;

/**
 * 羊B
 * @author bushneo
 * @create 2018-12-31 10:07
 */
public class SheepB implements Cloneable{

    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //自己手动更改clone方法，实现深克隆
        SheepB sleepB = (SheepB) super.clone();
        sleepB.birthday = (Date) this.birthday.clone();

        return sleepB;
    }

    @Override
    public String toString() {
        return "SheepB{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
