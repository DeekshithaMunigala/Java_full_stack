package com.wipro.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		
		Set<Integer> setList = new HashSet();
		setList.addAll(list);
		System.out.println(setList);
		

	}

}
