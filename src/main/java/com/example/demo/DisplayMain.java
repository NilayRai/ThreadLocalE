package com.example.demo;

public class DisplayMain extends Thread {
	Display d;
	String s;

	public DisplayMain(Display d, String s) {
		this.d = d;
		this.s = s;
	}

	@Override
	public void run() {
		try {
			d.wish(s);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Display d = new Display();
		DisplayMain dm = new DisplayMain(d, "Mahi");
		DisplayMain md = new DisplayMain(d, "Nilay");
		dm.start();
		md.start();
	}
}
