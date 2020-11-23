package com.sk.proxy;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/23 22:08
 */
public class StaticProxy {

	static class ZhangsanFather implements Person{

		Zhangsan zhangsan;

		@Override
		public void info() {
			System.out.println("这是我儿子");
			zhangsan.info();
			System.out.println("介绍完毕");
		}
	}

	static class Zhangsan implements Person{

		@Override
		public void info() {
			System.out.println("我叫张三");
		}
	}


	interface Person{
		void info();
	}
}
