package ExceptionHandling;
/* 
 * Checked exception: compiler knows about it
 * Unchecked exception: compiler doesn't know about it(runtime exceptions)
 * 
 * Rules:
 * Create a resource in try
 * Handle the resource in catch
 * Close the resource in finally
 * 
 * Note:
 * For checked exception we must provide a throws exception or surround with try-catch or try-finally block
 * Any classes with java.io come with resources
 * Need to close the resource in finally block
 * */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedException {

	public static void exampleWithoutTryCatch() throws Exception {
		System.out.println("Enter a number");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int	n = Integer.parseInt(br.readLine());	
		
		System.out.println(n);
		
	}
	
	public static void exampleWithTryCatch() throws Exception {
		System.out.println("Enter a number");
		int n=0;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());	
		} 
		catch (Exception e) {
			System.out.println(e);
		} 
		finally {
			br.close();
		}
		
		System.out.println(n);
		
	}
	
	public static void main(String[] args) throws Exception {
		exampleWithoutTryCatch();
//		exampleWithTryCatch();
	}

}
