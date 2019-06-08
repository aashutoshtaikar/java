package functionPointer;
// Reference : https://programming.guide/java/function-pointers-in-java.html

class CustomExceptions{
	public static void arithmetic() {
		int i = 9/0;
	}
	
	public static void arrayOutOfBounds() {
		int b[] = {9};
		b[1] = 10;
	}
	
	public static void randomExceptions() {
		int a[] = null;
		a[4] = 8;
	}
}

// Inside runnable
//@FunctionalInterface
//interface Testable{
//	void run();
//}

//from java 1.6/java 6
public class MethodReferences {
	
	public static void runAndHandle(Runnable toRun) {
		try {
			toRun.run();
		}
		catch(ArithmeticException ae) {
			System.out.println("error string: " + ae.toString());
//			System.out.println("error message: cannot "+ ae.getMessage());
			System.out.println("Handle exception by notifying the user");
		}
		catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("error: " + aie.toString());
			System.out.println("Handle exception by copying array to arrayList");
		}
		catch (Exception e) {
			System.out.println("error: " + e.toString());
			System.out.println("Unknown state, cannot handle this");
		}
		finally {
			System.out.println("program quiting...\n");			
		}
	}
	
	public static void main(String[] args) {
		// function pointer using method references ClassName::methodName
		runAndHandle(CustomExceptions::arithmetic);
		runAndHandle(CustomExceptions::arrayOutOfBounds);
		runAndHandle(CustomExceptions::randomExceptions);
		
	}

}
