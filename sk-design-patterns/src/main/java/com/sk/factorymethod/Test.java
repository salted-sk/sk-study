package com.sk.factorymethod;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/16 22:06
 */
public class Test {

	public static void main(String[] args) {
		CourseFactory factory = new JavaCourseFactory();
		factory.getCourse().courseInfo();
		factory = new PhpCourseFactory();
		factory.getCourse().courseInfo();
	}

}
