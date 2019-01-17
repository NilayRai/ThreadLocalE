package com.example.demo;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("Java");
		}
	}

	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}
	}
}
