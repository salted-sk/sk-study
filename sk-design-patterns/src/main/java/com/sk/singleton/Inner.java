package com.sk.singleton;

import javax.jws.Oneway;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/17 8:55
 */
public class Inner {

    public Inner(){
        System.out.println("创建inner对象");
    }


    private static  Inner inner = null;

    public static Inner getInner(){
        inner = InnerCourse.inner;
        return inner;
    }

    private static class InnerCourse{

        private static final Inner inner = new Inner();

    }

}
