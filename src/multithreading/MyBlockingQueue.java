package multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue {

	private int max;
	private Queue<Integer> queue;
	private ReentrantLock lock = new ReentrantLock();
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();

	public MyBlockingQueue(int size) {
		queue = new LinkedList<Integer>();
		this.max = size;
	}

	private void put(Integer data) {
		lock.lock();

		try {
			while (queue.size() == max) {
				notFull.await();
			}

			queue.add(data);
			notEmpty.signalAll();

		} catch (Exception e) {

		} finally {
			lock.unlock();
		}

	}

	private Integer take() {
		Integer data = null;

		lock.lock();

		try {
			while (queue.size() == 0) {
				notEmpty.await();
			}

			data = queue.remove();
			notFull.signalAll();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}

		return data;

	}

	public static void main(String[] args) {
           MyBlockingQueue queue = new MyBlockingQueue(10);
           
           final Runnable producer = () -> {
        	   while(true) {
        		 queue.put(1);  
        	   }
           };
           
           new Thread(producer).start();
           new Thread(producer).start();
           
           final Runnable consumer = () -> {
        	   while(true) {
        		   System.out.println(queue.take());
        	   }
           };
           
          new Thread(consumer).start();
          new Thread(consumer).start();
          
          try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
