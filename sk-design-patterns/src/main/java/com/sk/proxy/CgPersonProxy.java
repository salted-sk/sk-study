package com.sk.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/23 22:19
 */
public class CgPersonProxy implements MethodInterceptor {

	public Object getZhangsan() {
		Class<?> clazz = Zhangsan.class;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	public static void main(String[] args) {
		Object o = new CgPersonProxy().getZhangsan();
		((Person)o).info();
		System.out.println();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		return methodProxy.invokeSuper(o, objects);
	}
}
