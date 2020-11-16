package com.sk.factorymethod;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/16 22:03
 */
public class PhpCourseFactory implements CourseFactory {

	@Override
	public Course getCourse() {
		return new PhpCourse();
	}

}
