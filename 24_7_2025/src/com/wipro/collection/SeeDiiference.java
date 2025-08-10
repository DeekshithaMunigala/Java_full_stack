package com.wipro.collection;

import java.util.HashSet;
import java.util.Set;

public class SeeDiiference {

	public static void main(String[] args) {
		
		Set<Integer> setA = new HashSet();
		
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		
		Set<Integer> setB = new HashSet();
		
		setB.add(1);
		setB.add(3);
		
		
		Set<Integer> difference = new HashSet(setA);
		difference.removeAll(setB);
		
		System.out.println(difference);


	}

}
