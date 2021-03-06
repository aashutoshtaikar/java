package singleton2;


class God{
	private String name;
	
	//Lazy instantiation
	static God staticoObj;
	
	private God() {
		System.out.println("creating instance");
	}
	
	//multiple threads accessing this method will cause failure of singleton
	public static God getInstance() {
		//Lazy instantiation
		if(staticoObj==null) {
			staticoObj = new God();
		}
		return staticoObj;
	}
	
}

public class SingletonLazy {
	static void normalCase() {
		God myGod = God.getInstance();
		
		God yourGod = God.getInstance();
	}
	
	static void multithreadedCase() {
		Thread t1 = new Thread(()->{God myGod = God.getInstance();});
		Thread t2 = new Thread(()->{God yourGod = God.getInstance();});
		
		t1.start();
		t2.start();	
	}
	
	public static void main(String[] args) {
//		normalCase();
		multithreadedCase();
	}

}
