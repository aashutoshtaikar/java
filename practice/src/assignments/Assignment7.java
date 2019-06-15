package assignments;

public class Assignment7 {

//	7. Rotate a String with number of positions
//	Ex: JavaConcepts - 3
	public static String rotateString(String str, int rotateFrom) {
		String temp = "";
		for (int i = rotateFrom; i < str.length()+rotateFrom; i++) {
			if(i<str.length()) {
				temp += str.charAt(i);	
			}else {
				temp += str.charAt(i%rotateFrom);
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		System.out.println(rotateString("Hello", 2));
	}

}
