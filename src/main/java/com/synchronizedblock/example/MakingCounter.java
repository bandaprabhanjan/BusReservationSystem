package com.synchronizedblock.example;

public class MakingCounter implements Runnable {
	private int counter;

	public int getCounter() {
		return counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20000; i++) {
			increment();
		}

	}

	private int increment() {
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			return counter++;
		}
	}
}
