package com.sk.singleton;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/17 8:49
 */
public class Lazy {

    private static JavaCourse course = null;

    public static JavaCourse getCourse(){
        if (course == null){
            synchronized (Lazy.course){
                if (course == null){
                    course = new JavaCourse();
                }
            }
        }
        return course;
    }

}
