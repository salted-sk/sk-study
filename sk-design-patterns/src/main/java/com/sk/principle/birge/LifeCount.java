package com.sk.principle.birge;

public class LifeCount implements Count {
	@Override
	public String count() {
		System.out.println("我是活期，我的账号是123456");
		return "123456";
	}

	@Override
	public String type() {
		System.out.println("我是活期，我的账号是123456");
		return "活期";
	}
}
