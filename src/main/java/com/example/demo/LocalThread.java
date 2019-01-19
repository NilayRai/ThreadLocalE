package com.example.demo;

public class LocalThread extends ThreadLocal<Integer> {
	static Integer custiD = 0;

	protected Integer initialValue() {
		int k=12;
		int f=134;
		return ++custiD;
		
		
		
	}

}
