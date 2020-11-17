package com.sk.singleton;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/17 23:05
 */
public class ThreadLocalSingle {

	private static ThreadLocal<ThreadLocalSingle> threadLocal = ThreadLocal.withInitial(() -> new ThreadLocalSingle());

	public static ThreadLocalSingle getInstance() {
		return threadLocal.get();
	}

}
