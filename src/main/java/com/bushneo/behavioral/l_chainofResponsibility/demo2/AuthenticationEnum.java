package com.bushneo.behavioral.l_chainofResponsibility.demo2;

/**
 * @author bushneo
 * @version 1.0.0
 * @createTime 2022年04月24日 11:47:00
 */
public enum AuthenticationEnum {

    /**
     * 腾讯
     */
    TENCENT("TENCENT");

    public final String name;

    AuthenticationEnum(String name) {
        this.name = name;
    }
}
