package com.bushneo.d_prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 羊C
 * @author bushneo
 * @create 2018-12-31 10:07
 */
public class SheepC implements Serializable {

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
    public String toString() {
        return "SleepA{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
