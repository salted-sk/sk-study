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

    private static JavaCourse course = null;

    private static  Inner inner = new Inner();

    public static JavaCourse getCourse(){
        course = InnerCourse.course;
        return course;
    }

    private static class InnerCourse{

        private static final JavaCourse course = new JavaCourse();

    }

}
