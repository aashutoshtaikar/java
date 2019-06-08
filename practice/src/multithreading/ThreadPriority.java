package multithreading;


public class ThreadPriority {

	public static void main(String[] args) {
		Thread t1 = new Thread(()->System.out.println("hello from t1"));
		Thread t2 = new Thread(()->System.out.println("hello from t2"));
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
		
	}

}
