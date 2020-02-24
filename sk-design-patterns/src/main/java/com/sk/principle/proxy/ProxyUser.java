package com.sk.principle.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/2/4 13:44
 */
public class ProxyUser implements InvocationHandler {


	private User user = (User) Proxy.newProxyInstance(User.class.getClassLoader(), User.class.getInterfaces(), this);

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
		System.out.println("切入");
		method.invoke(user, args);
		System.out.println("切出");
		return null;
	}

	public static void main(String[] args) {
		User user = new ProxyUser().user;
		user.setName("2");
	}
}
