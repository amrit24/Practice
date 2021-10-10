package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
		
		final Runnable producer = () -> {
			while(true) {
				try {
					queue.put(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		
		new Thread(producer).start();
		new Thread(producer).start();
		
		final Runnable consumer = () -> {
			while(true) {
				try {
					System.out.println(queue.take());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(consumer).start();
		new Thread(consumer).start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
