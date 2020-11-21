package com.sk.bridge;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/9/9 9:12
 */
public abstract class Bank {

    private Account account;

    public Bank(Account account) {
        this.account = account;
    }

    protected abstract void showType();

    protected abstract void show();

}
