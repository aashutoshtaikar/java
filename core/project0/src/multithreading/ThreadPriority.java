package multithreading;

public class ThreadPriority {

	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(()-> {
			for (int i = 0; i < 4; i++) {
				System.out.println("Hi");
				try { Thread.sleep(500);} catch(Exception e){System.out.println(e);}
			}
		});
		
		Thread t2 = new Thread(()-> {
			for (int i = 0; i < 4; i++) {
				System.out.println("Hello, priority:" + Thread.currentThread().getPriority());
				try { Thread.sleep(500);} catch(Exception e){System.out.println(e);}
			}
		});
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("t1 priority: "+ t1.getPriority());
		System.out.println("t2 priority: "+ t2.getPriority());
		
		t2.start();
		t1.start();
		
		t2.join();
		t1.join();	
	}
}
