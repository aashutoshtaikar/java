// int, float, double - primitive types
// Integer - wrapper class by java.lang


public class WrapperClasses {
	
	public static void main(String[] args) {
		
		//Integer is a wrapper class by java.lang
		
		Integer ii = new Integer(1); //boxing, wrapping 
		int y = ii.intValue(); //unboxing, unwrapping
		
		Integer i2 = 1; //auto-boxing, auto-wrapping
		int x = ii; //auto-unboxing, auto-unwrapping
		
		//wrapper classes are slow, primitives are fast, but some APIs like hibernate require wrapper classes only
		
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);
	}

}
