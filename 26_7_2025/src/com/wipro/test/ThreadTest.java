package com.wipro.test;

import com.wipro.thread.PrintAlphabetsThread;
import com.wipro.thread.PrintNUmbersThread;

public class ThreadTest {

	public static void main(String[] args) {
		
		PrintNUmbersThread printNum = new PrintNUmbersThread();
		PrintAlphabetsThread printAlpha = new PrintAlphabetsThread();
		
		System.out.println("Both threads have Started");
		
		printNum.start();
		printAlpha.start();
		
		try {
			printNum.join();
			printAlpha.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Both threads have finished");

	}

}
