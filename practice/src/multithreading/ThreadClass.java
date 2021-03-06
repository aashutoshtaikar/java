package multithreading;

/*Two ways to create threads:
 * 1. by extending the Thread class
 * 2. by implementing the Runnable interface
 * */ 

//* 1. by extending the Thread class

class MyThread extends Thread{
	public int[] values = {1,2,3,4};
	
	public void run() {
		for (int i = 0; i < values.length; i++) {
			values[i] = values[i] * values[i];
		}
	}
}

public class ThreadClass {

	public static void main(String[] args) throws Exception {
		MyThread t1 = new MyThread();
		t1.start();
		t1.join();
		
		for (int i : t1.values) {
			System.out.println(i);
		}
	}

}
