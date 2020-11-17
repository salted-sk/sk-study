package com.sk.singleton;

import lombok.Data;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/17 8:48
 */
@Data
public class JavaCourse {

    JavaCourse(){
        System.out.println("创建java课程");
    }

    private String name;

    private BigDecimal price;

}
