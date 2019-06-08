class Printer{
//	public void show(Integer i) {
//		System.out.println(i);
//	}
//	
//	public void show(Double d) {
//		System.out.println(d);
//	}

	/*
	 * 1. Number is an abstract class and Integer, Double extends it. 
	 * 2. An abstract class cannot be instantiated by its own type 
	 * 		but can be instantiated through a concrete class.
	 * 3. Here we have specified a reference to Number abstract class which works
	 * 		by instantiating by passing the new Integer(5), new Double (5.5) objects  
	 * For ex. Number n = new Integer(5); // this is deprecated since java 9 
	 */
	
	public void show(Number n) {
		System.out.println(n);
	}
}
public class NeedAbstractClass {

	public static void main(String[] args) {
		Printer obj = new Printer();
		obj.show(5);
		obj.show(5.5);
	}

}
