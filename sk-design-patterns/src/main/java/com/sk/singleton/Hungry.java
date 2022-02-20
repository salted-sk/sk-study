package com.sk.singleton;

import com.sk.proxy.Person;

import javax.jws.WebResult;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/17 8:55
 */
public class Hungry {
    private static Hungry hungry = new Hungry();
    @WebResult(name = Person.s)
    public Hungry getHungry(){
        return hungry;
    }

}
