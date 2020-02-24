package com.sk.principle.observer;

import java.util.Observable;

public class Course extends Observable {
	private String name;

	public Course(String name) {
		this.name = name;
	}

	public void courseInfo() {
		System.out.println("我是一个"+name+"课程");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void pub(){
		System.out.println("整体推送");
		setChanged();
		notifyObservers();
	}
}
