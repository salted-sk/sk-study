package com.sk.principle.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(Arrays.stream(new String[]{"1", "2"}));
		list.add(Arrays.stream(new String[]{"a", "b"}));
		list.add(Arrays.stream(new String[]{"A", "B"}));
		list.stream().flatMap(s ->
				s
		).forEach(System.out::println);


	}
}
