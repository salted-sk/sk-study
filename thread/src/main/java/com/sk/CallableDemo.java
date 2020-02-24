package com.sk;

import java.util.concurrent.*;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/1/30 21:11
 */
public class CallableDemo implements Callable<String> {
	private static int i;

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() ->{
			while (!Thread.currentThread().isInterrupted()) {
				i++;
			}
			System.out.println(i);
		});
		thread.start();
		TimeUnit.SECONDS.sleep(1);
		thread.interrupt();


//		ExecutorService service = Executors.newSingleThreadExecutor();
//
//		ThreadFactory namedThreadFactory = (r) -> new Thread();
//
//		//Common Thread Pool
//		ExecutorService pool = new ThreadPoolExecutor(5, 200,
//				0L, TimeUnit.MILLISECONDS,
//				new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
//
//		pool.execute(()-> System.out.println(Thread.currentThread().getName()));
//		pool.shutdown();//gracefully shutdown
//		ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1);
//		Future<String> re = service.submit(new CallableDemo());
//		re.cancel(true);
//
//		System.out.println(re.get());
//		service.shutdown();

	}

	@Override
	public String call() {
		return "sk";
	}
}
