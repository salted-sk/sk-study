package com.sk.bridge;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/20 8:39
 */
public class DeadCount implements Count{

    private String account;

    public DeadCount(String account){
        this.account = account;
    }

    @Override
    public String getAccount() {
        System.out.println("账号=" + account);
        return account;
    }

    @Override
    public String type() {
        System.out.println("死期账号");
        return "死期";
    }
}
