package com.sk.sync;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/2/3 12:52
 */
public class NotifyLock extends Thread{
	private Object lock;

	public NotifyLock(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("开始执行Notify");
			lock.notify();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("执行结束Notify");
		}
	}
}
