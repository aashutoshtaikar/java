package singleton1;

class God{
	
	//Eager instantiation
	static God staticoObj = new God();
	
	private God() {
		System.out.println("creating instance");
	}
	
	public static God getInstance() {
		return staticoObj;
	}
	
}

public class SingletonEager {

	public static void main(String[] args) {
		God myGod = God.getInstance();
		
		God yourGod = God.getInstance();
	}

}
