package assignments;

public class Assignment6 {
	
//	6. Reverse a String without using reverse()
	public static String reverseString(String str) {
		String reversedString = "";
		for (int i=str.length()-1; i>=0;i--) {
			reversedString += str.charAt(i); 				
		}
		return reversedString;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("Aashutosh"));
	}
}
