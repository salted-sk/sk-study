package com.sk.singleton;

import lombok.Data;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/17 22:42
 */
public enum EnumSingle {

	JAVA_COURSE("JAVA", BigDecimal.ZERO);

	 EnumSingle(String name, BigDecimal price){
		this.name = name;
		this.price = price;
	}

	private String name;

	private BigDecimal price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public static EnumSingle getJavaCourse() {
		return JAVA_COURSE;
	}

}
