package com.java.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = Arrays.asList(1,3,5,6,7,8,10);
		System.out.println("printing even values");
		lst.stream().filter(i -> i%2==0).forEach(System.out::println);
		System.out.println("so these were the values you wanted");
		System.out.println("okay thanks see you later!");
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
	}

}
