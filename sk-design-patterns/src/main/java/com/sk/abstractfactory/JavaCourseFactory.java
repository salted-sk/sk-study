package com.sk.abstractfactory;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/16 22:42
 */
public class JavaCourseFactory extends CourseFactory {
	@Override
	Video getVideo() {
		return new JavaVideo();
	}

	@Override
	Notes getNotes() {
		return new JavaNotes();
	}
}
