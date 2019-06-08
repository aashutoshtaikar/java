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
package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {
	
	public static void exampleWithoutTryCatch() throws Exception {
		System.out.println("Enter a number");
		int	n;
		
		//java 1.7 resource handling - as soon as the object goes out of scope the close is called on that object
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			n = Integer.parseInt(br.readLine());		
		}
		System.out.println(n);
		
	}
	
	public static void main(String[] args) throws Exception {
		exampleWithoutTryCatch();
	}

}
