package multithreading;

class Counter{
	public int count;
	
	public synchronized void incrementCount() {
		count++;
	}
}

public class Synchronization {

	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.incrementCount();
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				c.incrementCount();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}

}
