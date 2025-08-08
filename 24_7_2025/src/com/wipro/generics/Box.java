package com.wipro.generics;

public class Box <T> {
	T t;
	
	 public void set(T item) {
		this.t = item;
	}
	 
	 public T get() {
		 return t;
	 }
}
