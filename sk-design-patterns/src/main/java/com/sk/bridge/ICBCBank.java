package com.sk.bridge;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/20 8:41
 */
public class ICBCBank extends Bank {

    public ICBCBank(Count count) {
        super(count);
        System.out.println("中国工商银行");
    }

    @Override
    public Count getCount() {
        return count;
    }

}
