package com.sk.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/2/3 12:52
 */
public class WaitLock extends Thread{
	private Lock lock;
	private Condition condition;

	public WaitLock(Lock lock, Condition condition) {
		this.lock = lock;
		this.condition = condition;
	}

	@Override
	public void run() {
		lock.lock();
		try {
			System.out.println("开始执行wait");
			condition.await();
			System.out.println("执行结束wait");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
