package com.producer.consumer.problem;

import java.util.Queue;

public class Consumer implements Runnable {

	private Queue<Integer> sharedQueue;

	public Consumer(Queue<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (sharedQueue) {
				while (sharedQueue.isEmpty()) {
					try {
						System.out.println("Consumer is waiting to produce objects by Produder..");
						sharedQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int data = sharedQueue.poll();
				System.out.println("Consumed::" + data);
				sharedQueue.notify();
			}

		}

	}

}
