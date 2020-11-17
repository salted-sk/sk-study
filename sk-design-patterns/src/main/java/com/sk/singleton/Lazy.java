package com.sk.singleton;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/17 8:49
 */
public class Lazy {

    private static Lazy lazy = null;

    public static Lazy getCourse(){
        if (lazy == null){
            synchronized (Lazy.class){
                if (lazy == null){
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }

}
