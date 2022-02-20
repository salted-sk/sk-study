package com.sk.proxy;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/23 22:33
 */
public class Zhangsan implements Person{

    private int age;

	@Override
    public void info() {
		System.out.println("我叫张三");
	}

    @Override
    public String toString() {
        return "测试toString";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
