package com.sk.prototype;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/18 8:48
 */
public class Test {

    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setName("java课程");
        javaCourse.setPrice(BigDecimal.TEN);
        Map<String, String> cloneMap = new HashMap<>();
        cloneMap.put("A","a");
        cloneMap.put("B","b");
        cloneMap.put("C","c");
        javaCourse.setCloneMap(cloneMap);
        JavaCourse course2 = (JavaCourse) javaCourse.clone();
        javaCourse.getCloneMap().remove("A");
        System.out.println(javaCourse);
        System.out.println(course2);
    }

}
