package com.bushneo.structural.f_proxy.dynamicProxy.demo1;

/**
 * 周杰伦
 * @author bushneo
 * @create 2019-01-01 11:19
 */
public class Jay implements StarRole {

    @Override
    public void confer() {
        System.out.println("亲自面谈");
    }

    @Override
    public void signContract() {
        System.out.println("亲自签合同");
    }

    @Override
    public void sing() {
        System.out.println("接下来演唱的歌曲是，《稻香》，“还记得家是唯一的城堡，随着稻香河流继续奔跑，微微笑，小时候的梦我知道。。。”");
    }

    @Override
    public void collectMoney() {
        System.out.println("亲自收钱");
    }
}
