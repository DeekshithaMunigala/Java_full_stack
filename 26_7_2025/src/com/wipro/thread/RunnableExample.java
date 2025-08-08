package com.wipro.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>(Arrays.asList("Jayanta", "Amit", "Jack", "Esha"));
		
		Thread vowelThread = new Thread(() -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                if (startsWithVowel(name)) {
                    names.set(i, name.toUpperCase());
                }
            }
        });
		
		Thread nonVowelThread = new Thread(() -> {
			for(int i=0; i<names.size(); i++) {
				String name = names.get(i);
				if(!startsWithVowel(name)) {
					names.set(i, name.toLowerCase());
				}
			}
		});
		
		vowelThread.start();
		nonVowelThread.start();
		
		try {
			vowelThread.join();;
			nonVowelThread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Names : " + names);
			

	}

	private static boolean startsWithVowel(String name) {
		if(name == null || name.isEmpty()) return false;		
		char ch = Character.toLowerCase(name.charAt(0));		
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'; 
	}

}
