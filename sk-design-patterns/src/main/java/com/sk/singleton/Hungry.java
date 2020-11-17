package com.sk.singleton;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/17 8:55
 */
public class Hungry {

    private static Hungry hungry = new Hungry();

    public Hungry getHungry(){
        return hungry;
    }

}
