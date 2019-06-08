
class X{
	
	final int DAY = 0; //constant capital letters 
	
	public X() {
//		DAY = 10; //cannot do this
	}
	
	public final void show() {
		System.out.println("showing.. from X");
	}
}

// // cannot extend a final class 
//class Y extends X{
//	
//}

class Y extends X{
// //Cannot override a final declared method 
//	public void show() {
//		System.out.println("showing.. from Y");
//	}
}


public class FinalKeyword {

	public static void main(String[] args) {

	}

}
