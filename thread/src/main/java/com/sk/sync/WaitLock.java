package com.sk.sync;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/2/3 12:52
 */
public class WaitLock extends Thread{
	private Object lock;

	public WaitLock(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("开始执行wait");
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("执行结束wait");
		}
	}
}
