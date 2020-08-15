package com.staticsynchronized.example;

public class MakingCounter extends Thread {
	private static int counter;

	public void run() {
		for (int i = 1; i <= 20000; i++) {
			increment();
		}
	}

	private static synchronized void increment() {
		counter++;

	}

	public static int getCounter() {
		return counter;
	}

}
