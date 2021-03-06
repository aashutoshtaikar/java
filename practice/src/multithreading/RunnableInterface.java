package multithreading;

/*Two ways to create threads:
 * 1. by extending the Thread class
 * 2. by implementing the Runnable interface
 * */ 

// 2. by implementing the Runnable interface - advantage if we are extending some super class (A)

//some super class
class A{
	
}

//B cannot extend more than 1 class(cannot extend Thread in this case)
class B extends A implements Runnable{

	@Override
	public void run() {
		System.out.println("hello from B");
	}
	
}

public class RunnableInterface {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new B());
		t1.start();
		t1.join();
	}

}
