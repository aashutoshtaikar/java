package multithreading;



public class LambdaExp {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello from t1");
			}
		});
		
		Thread t2 = new Thread(()->{System.out.println("hello from t2");});
		
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
	}
}
