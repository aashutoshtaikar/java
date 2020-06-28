package singleton4;


class God{
	
	static God staticoObj;
	
	private God() {
		System.out.println("creating instance");
	}
	
	//Thread safe singleton without overhead of synchronized
	public static God getInstance() {
		
		if(staticoObj==null) {
			
			synchronized (God.class) {
				if(staticoObj==null)
					staticoObj = new God();
			}
		}
		
		return staticoObj;
	}
	
}

public class SingletonLazyDoubleChecked {
	
	static void withDoubleCheck() throws Exception {
		Thread t1 = new Thread(()->{God myGod = God.getInstance();});
		Thread t2 = new Thread(()->{God yourGod = God.getInstance();});
		Thread t3 = new Thread(()->{God yourGod1 = God.getInstance();});
		Thread t4 = new Thread(()->{God yourGod2 = God.getInstance();});

		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
	
	public static void main(String[] args) throws Exception {
		withDoubleCheck();
		
	}

}
