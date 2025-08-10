package com.wipro.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorService {
	public static void main(String[] args) {
		
		ExecutorService ex = Executors.newFixedThreadPool(5);
//		
//		Callable<Integer> call = ()-> {
//			try {		
//				for(int num=1; num<=10; num ++) {
//					System.out.println("Task " + taskId + " : " + num);
//					Thread.sleep(1000);
//				}
//			} catch(InterruptedException e) {
//				e.printStackTrace();
//			}	
//		}
		
		for(int i=1; i<=5; i++) {
			int taskId = i;
			ex.submit(() -> {
				try {		
					for(int num=1; num<=10; num ++) {
						System.out.println("Task " + taskId + " : " + num);
						Thread.sleep(1000);
					}
				} catch(InterruptedException e) {
					e.printStackTrace();
				}	
				
			});
			
		}
		
		
		ex.shutdown();
	}
}
