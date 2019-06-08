package multithreading;


public class LambdaExp {
	public static void main(String[] args) throws Exception {
		
		Runnable obj1 = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 4; i++) {
					System.out.println("Hi");
					try { Thread.sleep(500);} catch(Exception e){System.out.println(e);}
				}
			}
		};
		
		
		Thread t1 = new Thread(obj1);
		
		Thread t2 = new Thread(()-> {
			for (int i = 0; i < 4; i++) {
				System.out.println("Hello");
				try { Thread.sleep(500);} catch(Exception e){System.out.println(e);}
			}
		});
		
		System.out.println("t1 is alive: "+ t1.isAlive());
		System.out.println("t2 is alive: "+ t2.isAlive());
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		
	}
}
