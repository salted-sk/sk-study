package com.sk.bridge;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/19 12:34
 */
public abstract class Bank {

    protected Count count;

    public Bank(Count count) {
        this.count = count;
    }

    public abstract Count getCount();

}
