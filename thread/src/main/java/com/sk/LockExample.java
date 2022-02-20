package com.sk;

import sun.util.resources.cldr.ak.LocaleNames_ak;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2022/2/10 8:55
 */
public class LockExample {

    static int a = 1;

    public static void main(String[] args) {

        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        Lock readLock = lock.readLock();
        Lock writeLock = lock.writeLock();
        Thread t1 = new Thread(() -> {
            writeLock.lock();
            try {
                int a = 1;
                while (true) {
                    a++;
                    System.out.println("1线程");
                    t1();
                    if (a == 10000) {
                        break;
                    }
                }
                readLock.lock();
            } catch (Exception e) {

            }finally {
                writeLock.unlock();
            }
            try {
                while (true) {
                    System.out.println("1线程");
                    t1();
                }
            } catch (Exception e) {

            } finally {
                readLock.unlock();
            }

        });
        Thread t2 = new Thread(() -> {
            readLock.lock();
            while (true) {
                System.out.println("2线程");
                t1();
            }
        });
        t1.start();
        t2.start();

    }

    static void t1(){
        a++;
    }

    static void t2(){
        int b = a;
        System.out.println(b);
    }


}
