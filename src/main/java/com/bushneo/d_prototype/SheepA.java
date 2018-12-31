package com.bushneo.d_prototype;

import java.util.Date;

/**
 * 羊A,用来测试浅克隆
 * @author bushneo
 * @create 2018-12-31 10:07
 */
public class SheepA implements Cloneable{

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
        return super.clone();
    }

    @Override
    public String toString() {
        return "SleepA{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
