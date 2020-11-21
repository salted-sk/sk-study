package com.sk.bridge;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/9/9 9:15
 */
public class ABCBank extends Bank {

    private Account account;

    public ABCBank(Account account) {
        super(account);
        this.account = account;
    }

    @Override
    protected void showType() {
        account.showType();
    }

    @Override
    protected void show() {
        account.show();
    }

}
