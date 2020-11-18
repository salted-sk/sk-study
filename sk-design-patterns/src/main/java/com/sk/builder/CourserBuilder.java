package com.sk.builder;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/18 21:35
 */
public class CourserBuilder implements Builder {
	@Override
	public JavaCourse builder() {
		return new JavaCourse()  ;
	}
}
