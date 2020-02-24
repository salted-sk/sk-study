package com.sk.principle.observer;

public class Test {
	public static void main(String[] args) {
		Course course = new Course("java");
		Teacher teacher = new Teacher("张三");
		Teacher teacher2 = new Teacher("李四");
		course.addObserver(teacher);
		course.addObserver(teacher2);
		course.addObserver(teacher2);
		course.courseInfo();
		course.pub();
	}
}
