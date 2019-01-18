package com.example.demo;

public class CustomerThread extends Thread {
int j;
int h;
int m;
	private static LocalThread l = new LocalThread();

	public CustomerThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello Java wakeup");
			System.out.println(Thread.currentThread().getName() + "\t" + "Executing with Customer ID" + "\t" + l.get());
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello India Wakaup");
		CustomerThread c1 = new CustomerThread("CustomerThread-1");
		CustomerThread c2 = new CustomerThread("CustomerThread-2");
		CustomerThread c3 = new CustomerThread("CustomerThread-3");
		CustomerThread c4 = new CustomerThread("CustomerThread-4");
		CustomerThread c5 = new CustomerThread("CustomerThread-5");
		CustomerThread c6 = new CustomerThread("CustomerThread-6");
int k=10;
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
	}
}
