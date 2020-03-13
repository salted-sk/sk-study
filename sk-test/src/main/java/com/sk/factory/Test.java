package com.sk.factory;

import java.util.concurrent.CountDownLatch;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/3/13 14:09
 */
public class Test {
    static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(200);
        for (int i1 = 0; i1 < 200; i1++) {
            new Thread(() -> {
                i++;
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            latch.countDown();
        }
        Thread.sleep(1000);
        System.out.println(i);
    }
}
