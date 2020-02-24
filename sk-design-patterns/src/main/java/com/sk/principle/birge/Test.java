package com.sk.principle.birge;

public class Test {
	public static void main(String[] args) {
		Bank bank = new ICBCBank(new LifeCount());
		bank.getCountInfo();
	}
}
