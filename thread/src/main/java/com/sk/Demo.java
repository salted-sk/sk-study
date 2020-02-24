package com.sk;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class Demo {
    PrintProcessor printProcessor;

    public Demo() {
        SaveProcessor saveProcessor=new SaveProcessor();
        saveProcessor.start();
        printProcessor=new PrintProcessor(saveProcessor);
        printProcessor.start();
    }

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<String> q1 = new LinkedBlockingQueue<>();
        q1.put("a");
        q1.put("b");
        q1.put("c");
        q1.put("d");
        q1.put("e");
        System.out.println(q1.peek());
        System.out.println(q1.poll());
        System.out.println(q1.size());
        System.out.println(q1.take());
        System.out.println(q1.size());
        int a = 0,b=0;
        long l1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            b=b+1;
        }
        long l2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            a++;
        }
        long l3 = System.currentTimeMillis();
        System.out.println("++" + (l2 - l1));
        System.out.println("++" + (l3 - l2));
        new Thread().join();

        Request request=new Request();
        request.setName("mic");
        new Demo().doTest(request);
    }

    public void doTest(Request request){

        printProcessor.processorRequest(request);

    }

}
