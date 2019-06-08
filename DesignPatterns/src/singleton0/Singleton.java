package singleton0;

//God is only one but is named different by humans, thus singleton pattern is used
class God{
	private String name;
	
	//Eager instantiation
	static God staticoObj = new God();
	
	private God() {
	}
	
	public static God getInstance() {
		return staticoObj;
	}
	
	public static void setname(String val) {
		staticoObj.name = val;
	}
	
	public static String getname() {
		return staticoObj.name;
	}
	
	//static factory method instead of constructor
	public static God rename(String val) {
		staticoObj.name = val;
		return staticoObj;
	}
}

public class Singleton {

	public static void main(String[] args) {
		God myGod = God.rename("Java");
		
		God yourGod = God.getInstance();
		System.out.println(yourGod.getname());
		
		yourGod.rename("Zeus");
		System.out.println(myGod.getname());
	}

}
