package multithreading;

class Hi extends Thread{
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Hi");
			try { Thread.sleep(1000);} catch(Exception e){System.out.println(e);}
		}
	}
}

class Hello extends Thread{
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Hello");
			try { Thread.sleep(1000);} catch(Exception e){System.out.println(e);}
		}
	}
}

public class ThreadClass2 {

	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
		obj2.start();
		
	}

}
