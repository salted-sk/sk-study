package com.sk.sync;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/2/3 12:56
 */
public class Demo {
	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		WaitLock waitLock = new WaitLock(lock);
		waitLock.start();
		NotifyLock notifyLock = new NotifyLock(lock);
		notifyLock.start();

		Thread.sleep(1000);
	}
}
