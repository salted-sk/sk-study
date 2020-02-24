package com.sk.principle.birge;

public abstract class Bank {

	Count count;

	public Bank(Count count) {
		this.count = count;
	}

	public abstract String getCountInfo();
}
