package enumExamples.enumExample1;

/*If you want want to create our own range of constants/constant objects(Java) we need enum
 * Before enum we used interface in java as java didnt support enum before 1.5 
 * */

interface MobileInterface{
	//by default anything inside the interface becomes a constant(final) even if we dont specify final 
	static final String APPLE = "Apple";
	static String SAMSUNG = "Samsung";
	static String HTC = "Htc";
}

enum MobileEnum{
	APPLE,SAMSUNG,HTC;
}

public class EnumExample1 {
	//can also define enum inside a class
	enum MobileInClass{
		APPLE,SAMSUNG,HTC;
	}
	
	
	static void interfaceRun() {
//		MobileInterface x = MobileInterface.APPLE;//cannot do this being an interface
		if (MobileInterface.APPLE == "Apple") {
			System.out.println("is an apple phone");
		}
		//however the problem here is on the client side we may not know if the APPLE is a string or int 
	}
	
	static void enumRun() {
		MobileEnum m = MobileEnum.APPLE;
		
		System.out.println(m);
		System.out.println(MobileEnum.APPLE);
	
	}
	
	public static void main(String[] args) {
//		interfaceRun();
		enumRun();
	}

}
