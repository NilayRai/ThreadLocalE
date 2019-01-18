package com.example.demo;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
	ReentrantLock l = new ReentrantLock();

	public void wish(String name) throws InterruptedException {
		for (int i = 0; i < 12; i++) {
			System.out.print(Thread.currentThread().getName());
		}
		l.lock();
		for (int i = 0; i < 5; i++) {
			System.out.println("Good morning");
			Thread.sleep(2000);
			System.err.println(name);
		}
		l.unlock();
	}
}
