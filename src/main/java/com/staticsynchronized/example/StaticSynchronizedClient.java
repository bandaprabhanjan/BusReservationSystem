package com.staticsynchronized.example;

public class StaticSynchronizedClient {

	public static void main(String[] args) {
		MakingCounter t1= new MakingCounter();
		MakingCounter t2 = new MakingCounter();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Static Synchronized Counter" +MakingCounter.getCounter());
	}

}
