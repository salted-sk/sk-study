package com.sk.bridge;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/9/9 9:09
 */
public class AliveAccount implements Account {

    @Override
    public void showType() {
        System.out.println("活期账户");
    }

    @Override
    public void show() {
        System.out.println("随取随存");
    }
}
