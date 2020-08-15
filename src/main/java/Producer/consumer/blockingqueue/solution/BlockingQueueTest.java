package Producer.consumer.blockingqueue.solution;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) {
		BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<Integer>(5);
		Producer producer = new Producer(sharedQueue);
		Thread producerThread = new Thread(producer);
		Consumer consumer = new Consumer(sharedQueue);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();

	}

}
