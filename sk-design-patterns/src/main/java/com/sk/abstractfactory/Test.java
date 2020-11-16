package com.sk.abstractfactory;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/16 22:43
 */
public class Test {

	public static void main(String[] args) {
		CourseFactory factory = new JavaCourseFactory();
		factory.getVideo().videoInfo();
		factory.getNotes().notesInfo();
		factory = new PhpCourseFactory();
		factory.getVideo().videoInfo();
		factory.getNotes().notesInfo();
	}

}
