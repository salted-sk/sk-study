package com.sk.principle.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
	private String name;

	public Teacher(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		Course course = (Course)o;
		System.out.println(name + "观察到了"+course.getName()+"更新课程");
	}
}
