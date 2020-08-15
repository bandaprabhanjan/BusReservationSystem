package com.synchronizedblock.example;

public class ClientSynchronizedBlock {

	public static void main(String[] args) {
		MakingCounter r = new MakingCounter();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Counter Value" + r.getCounter());
	}

}

//Notes: Join method has called on t1 and t2 threads becaz, execution of run() method will be completed before calling to getCounter()
//At run time every class is an instance of class object which belongs to Java.lang.class 
//static synchronized methods locks the class instead of object(instance)
//keyword synchronized means that only one thread access the synchronized method at a time
