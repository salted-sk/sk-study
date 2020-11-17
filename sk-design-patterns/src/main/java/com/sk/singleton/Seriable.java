package com.sk.singleton;

import java.io.Serializable;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/17 22:46
 */
public class Seriable implements Serializable {

	private static final Seriable INSTANCE = new Seriable();

	private Seriable(){

	}

	public static Seriable getInstance(){
		return INSTANCE;
	}

	public Object readResolve(){
		return INSTANCE;
	}

}
