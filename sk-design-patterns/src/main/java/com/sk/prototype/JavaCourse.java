package com.sk.prototype;

import lombok.Data;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/18 8:46
 */
@Data
public class JavaCourse implements Cloneable {

    private String name;

    private BigDecimal price;

    private Map<String, String> cloneMap;

    @Override
    public Object clone() {
//        Object o = null;
//        try {
//            o = super.clone();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return o;
        Object o = null;
        try {
            o = super.clone();
            if (o instanceof JavaCourse){
                JavaCourse course = (JavaCourse)o;
                course.setCloneMap(new HashMap<>(course.getCloneMap()));
                o = course;
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;

    }
}
