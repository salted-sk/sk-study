package com.sk.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/2/3 12:56
 */
public class Demo {
	public static void main(String[] args) throws InterruptedException {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		WaitLock waitLock = new WaitLock(lock, condition);
		waitLock.start();
		NotifyLock notifyLock = new NotifyLock(lock, condition);
		notifyLock.start();

		Thread.sleep(1000);

	}
}
