package assignments;

public class Assignment14 {

//	14. Delete sequence of characters from a String
//	allthebest - 2, 5 - albest
	public static String deleteChars(String input, int start, int end) {
		StringBuffer stringBuffer = new StringBuffer();
		
		return stringBuffer.delete(start, end+1).toString();
	}
	
	public static void main(String[] args) {
		String input = "allthebest";
		System.out.println(deleteChars(input, 2, 5));
	}

}
