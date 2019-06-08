package multithreading;
/*Two ways to create threads:
 * 1. by extending the Thread class
 * 2. by implementing the Runnable interface
 * */ 

// 2. by implementing the Runnable interface - advantage if we are extending some super class (A)

class A{
	
}

class HipHip extends A implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("HipHip");
			try { Thread.sleep(500);} catch(Exception e){System.out.println(e);}
		}
	}
	
}

class Hurray implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Hurray");
			try { Thread.sleep(500);} catch(Exception e){System.out.println(e);}
		}
	}
	
}



public class RunnableInterface {

	public static void main(String[] args) throws Exception {
//		Runnable obj1 = new HipHip();
		Hurray obj2 = new Hurray();
		
		Thread t1 = new Thread(new HipHip());
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("t1 is alive: "+ t1.isAlive());
	}

}
