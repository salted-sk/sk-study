package com.sk.bridge;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/19 12:25
 */
public class Test {

    public static void main(String[] args) {
        Bank bank = new ICBCBank();
        bank.setCount(new LifeCount("123456"));
        Count count = bank.getCount();
        count.getAccount();
        count.type();
        bank.setCount(new DeadCount("654321"));
        count = bank.getCount();
        count.getAccount();
        count.type();
    }

}
