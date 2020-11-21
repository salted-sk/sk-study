package com.sk.bridge;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/9/9 9:11
 */
public class DieAccount implements Account {

    @Override
    public void showType() {
        System.out.println("定期账户");
    }

    @Override
    public void show() {
        System.out.println("不能随取随存");
    }
}
