package assignments;

public class Assignment12 {

//	12. Repeat a String number of times and append it
//	Ex: hello 4
//	hellohellohellohello
	public static String repeatString(String str, int ntimes) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ntimes; i++) {
			sb.append(str);			
		}	
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(repeatString(str, 4));
	}

}
