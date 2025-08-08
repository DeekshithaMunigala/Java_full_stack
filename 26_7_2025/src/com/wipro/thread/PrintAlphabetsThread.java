package com.wipro.thread;

public class PrintAlphabetsThread extends Thread {
	
	public void run() {
		for(char c= 'A'; c<='J'; c++) {
			System.out.println("Aplhabet : " + c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
		
	}
}
