package com.wipro.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList();
		
		list.add(3);
		list.add(5);
		list.add(10);
		list.add(21);
		list.add(8);
		
		System.out.println(list);

		//list.remove(2);
		list.remove(new Integer(10));
		
		System.out.println(list.contains(5));
		System.out.println(list.indexOf(5));
		
		list.add(13);
		
		System.out.println(list);
		
	}

}
