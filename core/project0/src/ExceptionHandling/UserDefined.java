package ExceptionHandling;

class AshException extends Exception{
	String message = null;
	
	
	public AshException(String mesg) {
		this.message = mesg;
	}
	
	
	public String getMessage() {
		return message;
	}
	
}

public class UserDefined {
	static void throwingExcep() {
		int i,j;
		i = 7;
		j = 8;
		
		try {
			int k = i/j;
			
			if(k==0) {
				throw new Exception("k is zero");
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	static void throwingUserDefExcept() {
		int i,j;
		i = 7;
		j = 8;
		
		try {
			int k = i/j;
			
			if(k==0) {
				throw new AshException("k is zero");
			}
		} 
		catch (Exception e) {
			System.out.println("error: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		throwingUserDefExcept();
	}

}
