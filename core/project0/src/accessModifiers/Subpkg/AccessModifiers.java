package accessModifiers.Subpkg;
/* Private: accessible only inside the class
 * Default: accessible in package
 * Public: accessible in Any class or package
 * Protected: accessible in a Sub class
 * */


/*cannot access PackageFruits being accessible from the current package 
 * even though we imported it
 * */

//class Apple extends accessModifiers.PackageFruits{
//	public void show() {
//		System.out.println("can access: " + _default);
////		System.out.println("cant access " + _private);
//		System.out.println("can access: " + _protected);
//		System.out.println("can access: " + _public);
//	}
//}

import accessModifiers.PublicFruits;
class Banana extends PublicFruits{
	public void show() {
//		System.out.println("can't access: " + _default);
//		System.out.println("can't access " + _private);
		System.out.println("can access: " + _protected);
		System.out.println("can access: " + _public);
	}
}

class Mango{
	accessModifiers.PublicFruits some = new accessModifiers.PublicFruits();
	
	public void show() {
//		System.out.println("can't access, being package accessible: " + some._default);
//		System.out.println("can't access " + some._private);
//		System.out.println("can access, being sub class accessible" + some._protected);
		System.out.println("can access: " + some._public);
	}
}

public class AccessModifiers {
	accessModifiers.PublicFruits some = new accessModifiers.PublicFruits();
	
	public static void main(String[] args) {
		Banana basket = new Banana();
		basket.show(); 
		
		
	}

}
