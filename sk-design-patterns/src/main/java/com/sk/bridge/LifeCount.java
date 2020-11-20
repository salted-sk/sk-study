package com.sk.bridge;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/20 8:36
 */
public class LifeCount implements Count {

    private String account;

    public LifeCount(String account){
       this.account = account;
    }

    @Override
    public String getAccount() {
        System.out.println("账号=" + account);
        return account;
    }

    @Override
    public String type() {
        System.out.println("活期账号");
        return "活期";
    }

}
