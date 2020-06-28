package singleton5;

public class SingletonEnum {

	public static void main(String[] args) {
		Abc obj1 = Abc.INSTANCE;
		obj1.i = 5;
		obj1.show();
		
		Abc obj2 = Abc.INSTANCE;
		obj2.i = 4;
		
		obj1.show();
		
	}

}

//An enum with a final(constant)  
enum Abc{
	INSTANCE;
	
	int i;
	
	public void show() {
		System.out.println(i);
	}
}

enum Bcd{
	 SOMECONST;
	
	int i;
	
	public void show() {
		System.out.println(i);
	}
}