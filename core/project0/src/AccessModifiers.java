/*Private: specific class
 * Default: Specific package
 * Public: Any class or package
 * Protected: Sub class
 * */
class Fruits{
	String _default = "default (package accessible)";
	
	private String _private = "private (class/instance accessible)";
	
	protected String _protected = "protected (class and derived class accessible)";
	
	public String _public = "public (accessible across the package)";
}

class Banana extends Fruits{
	public void show() {
		System.out.println("can access: " + _default);
//		System.out.println("cant access " + _private);
		System.out.println("can access: " + _protected);
		System.out.println("can access: " + _public);
	}
}

public class AccessModifiers {

	public static void main(String[] args) {
		Banana basket = new Banana();
		basket.show(); 
	}

}
