package com.sk.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/2/19 15:54
 */
public class Test {
	public static void main(String[] args) {
		String s1 = "a";
		String reg = "[0-9]+(([.][0-9]+)|([0-9]*))";
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i + "i==" + (char)i);
//		}
//

		//'1111 1111''1111 1111''1111 1111''1111 1111'
		//'1111 1111''1111 1111''1111 1111''1111 1111'
		System.out.println(2>>>3);
		System.out.println(2>>3);
//
//		Pattern pattern = Pattern.compile("");

		System.out.println("1".matches(reg));
		System.out.println("12".matches(reg));
		System.out.println("12.1".matches(reg));
		System.out.println(".1".matches(reg));
		System.out.println("12.".matches(reg));
		System.out.println("12.2.2".matches(reg));
		System.out.println("\\");
		System.out.println("\\\\");
	}
}
