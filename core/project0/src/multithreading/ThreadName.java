package multithreading;

public class ThreadName {

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
		}, "Hello Thread");
		
		t1.setName("Hi Thread");
		
		System.out.println("t1 name: "+ t1.getName());
		System.out.println("t2 name: "+ t2.getName());
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}
}
