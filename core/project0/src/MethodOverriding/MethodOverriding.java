package MethodOverriding;
//child(sub) class method overrides parent(super) class method

class A{
	int i;
	public void show() {
		System.out.println("in A");
	}
}

class B extends A{
	int i;
	
	@Override
	public void show() {
//		super.show();
		System.out.println("in B");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		A bobj = new B();
		bobj.show();
		bobj.i = 2; //sets i in A
		
	}

}
