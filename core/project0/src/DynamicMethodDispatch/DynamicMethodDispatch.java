//how to create a reference of a super class and
//how to create an object of a subclass
package DynamicMethodDispatch;

class A{
	public void show() {
		System.out.println("in A");
	}
}

class B extends A{
	public void show() {
		System.out.println("in B");
	}
	
	public void load() {
		System.out.println("loading in B");
	}
	
}

class C extends A{
	public void show() {
		System.out.println("in C");
	}
}



public class DynamicMethodDispatch {

	public static void main(String[] args) {
		A aObj = new B();
		aObj.show();
//		aObj.load(); //won't work as not present in super class, and reference is of super class
		
		aObj = new C();
		aObj.show();
		
		aObj = new A();
		aObj.show();
	}

}
