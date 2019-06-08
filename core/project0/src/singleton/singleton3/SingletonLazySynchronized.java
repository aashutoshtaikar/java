package singleton.singleton3;


class God{
	
	static God staticoObj;
	
	private God() {
		System.out.println("creating instance");
	}
	
	//Thread safe singleton with overhead of synchronized
	public static synchronized God getInstance() {
		if(staticoObj==null) {
			staticoObj = new God();
		}
		return staticoObj;
	}
	
}

public class SingletonLazySynchronized {

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{God myGod = God.getInstance();});
		Thread t2 = new Thread(()->{God yourGod = God.getInstance();});
		
		t1.start();
		t2.start();	
	}

}
