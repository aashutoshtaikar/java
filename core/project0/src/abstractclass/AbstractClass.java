package abstractclass;

abstract class Human{
	
	public abstract void eat();
	
	public void walk() {
		System.out.println("Human walking");
	}
}

//concrete class
class Man extends Human{
	public void eat() {
		System.out.println("Man eating");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
//		Human obj = new Human(); //abstract class cannot be instantiated
		Human obj = new Man();
		obj.eat();
	}
}
