package com.sk.bridge;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/20 8:45
 */
public class ABCBank extends Bank{

    public ABCBank(Count count) {
        super(count);
        System.out.println("中国农业银行");
    }

    @Override
    public Count getCount() {
        return count;
    }
}
