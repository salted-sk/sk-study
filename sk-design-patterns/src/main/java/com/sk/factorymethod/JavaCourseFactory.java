package com.sk.factorymethod;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/16 22:02
 */
public class JavaCourseFactory implements CourseFactory {
	@Override
	public Course getCourse() {
		return new JavaCourse();
	}
}
