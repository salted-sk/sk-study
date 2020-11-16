package com.sk.abstractfactory;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/16 22:41
 */
public class PhpCourseFactory extends CourseFactory {
	@Override
	Video getVideo() {
		return new PhpVideo();
	}

	@Override
	Notes getNotes() {
		return new PhpNotes();
	}
}
