package com.sk.stack;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2021/9/16 14:04
 */
public class Test {

    public static void main(String[] args) {
        //statckTest();
        queueTest();
    }

    public static void queueTest(){
        Queue<String> queue = new ArrayBlockingQueue<>(10);
    }




    public static void statckTest(){
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.search("a"));
    }

}
