package com.sk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/23 22:19
 */
public class PersonProxy implements InvocationHandler {

	private Object target;

	public Object getZhangsan() {
		target = new Zhangsan();
		Class<?> clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object o = method.invoke(target, args);
		return o;
	}

	public static void main(String[] args) {
		Object o = new PersonProxy().getZhangsan();
		((Person)o).info();
		System.out.println(o);
	}
}
