package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int k=24;
		map.put(23, 25);
		map.put(k, 25);
		HashSet<Integer> l = new HashSet<Integer>(5);
		l.add(12);
		l.add(24);
		l.add(40);
		l.add(45);
	}
}
