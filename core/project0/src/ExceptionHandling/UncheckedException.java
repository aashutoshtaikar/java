/* 
 * Checked exception: compiler knows about it
 * Unchecked exception: compiler doesn't know about it(runtime exceptions)
 * 
 * Create a resource in try
 * Handle the resource in catch
 * Close the resource in finally
 * */

package ExceptionHandling;

public class UncheckedException {

	public static void main(String[] args) {
		try {
			int i = 9/0; // unchecked exception
		}
		catch(Exception e) {
			System.out.println("error string: " + e.toString());
			System.out.println("error message: cannot "+ e.getMessage());
		}
		finally {
			System.out.println("quiting..");			
		}
	}

}
