package com.sk.principle.birge;

public class ICBCBank extends Bank {

	public ICBCBank(Count count) {
		super(count);
	}

	@Override
	public String getCountInfo() {
		System.out.println("我是爱存不存银行");
		return count.type();
	}
}
