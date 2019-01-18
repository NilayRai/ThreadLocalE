package com.example.demo;

public class LocalThread extends ThreadLocal<Integer> {
	static Integer custiD = 0;

	protected Integer initialValue() {
		return ++custiD;
	}

}
