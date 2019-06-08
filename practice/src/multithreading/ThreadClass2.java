package multithreading;

class Hi extends Thread{
	
	public void run(){
		for (int i = 0; i < 4; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hi" + i);
		}
	}
}

class Hello extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				throw new InterruptedException();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello" + i);	
		}
		
	}
}

public class ThreadClass2 {
	
	public static void main(String[] args) throws Exception {
		Hi t1 = new Hi();
		Hello t2 = new Hello();
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
	}

}
