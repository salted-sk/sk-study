package com.sk.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/17 22:57
 */
public class Container {

	private static Map<String, Object> beanDefinition = new ConcurrentHashMap<>();

	public static Object getBean(String name) {
		Object bean = beanDefinition.get(name);
		if (bean != null){
			return bean;
		}
		synchronized (beanDefinition){
			bean = beanDefinition.get(name);
			if (bean != null){
				return bean;
			}
			bean = new Object();
			beanDefinition.put(name, bean);
		}
		return bean;
	}

}
