package multithreading;

public class ThreadName {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello from t1");
			}
		}, "t1 thread");
		
		Thread t2 = new Thread(()->{
			System.out.println("hello from t2");
		}, "t2 thread");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
	}

}
